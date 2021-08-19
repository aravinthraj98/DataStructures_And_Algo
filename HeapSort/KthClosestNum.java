package HeapSort;

import java.util.PriorityQueue;


public class KthClosestNum {
	static class Pair{
		int num;int index;
		Pair(int num,int index){
			this.num=num;
			this.index=index;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 4;int X = 35;
			      int  arr[] = {12, 16, 22, 30, 35, 39, 42, 
			               45, 48, 50, 53, 55, 56};
			      if(k>arr.length) {
			    	  System.out.print("not possible");
			    	  return;
			      }
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{return a.num-b.num;});
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==X)continue;
			if(X>arr[i]) {
				pq.add(new Pair(X-arr[i],i));
			}
			else pq.add(new Pair(arr[i]-X,i));
		}
		while(pq.isEmpty()==false && k!=0) {
			
			System.out.print(arr[pq.poll().index]+" ");
			k--;
		}
		
		

	}

}
