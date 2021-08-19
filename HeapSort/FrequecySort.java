package HeapSort;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequecySort {
 private static class Pair{
	 int frequency;int num;
	 Pair(int num,int frequency){
		 this.num=num;
		 this.frequency=frequency;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,2,3,4,4,4,4,4,1};
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int i:arr) 
			h.put(i,h.getOrDefault(i,0)+1);
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> {
			if(a.frequency==b.frequency) return a.num-b.num;
			return b.frequency-a.frequency;
		});
		for(int key:h.keySet()) {
			pq.add(new Pair(key,h.get(key)));
		}
		int index=0;
		while(pq.isEmpty()==false) {
			Pair p=pq.poll();
			for(int i=0;i<p.frequency;i++) {
				System.out.print(p.num+" ");
			}
		}
	}
		

	

}
