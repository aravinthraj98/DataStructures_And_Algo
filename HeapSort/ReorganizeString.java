package HeapSort;

import java.util.*;
import java.util.Map.Entry;


public class ReorganizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aaabbae";//ababaea
		HashMap<Character,Integer> h = new HashMap<>();
		PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->h.get(b).compareTo(h.get(a)));
		
		for(char i:s.toCharArray()) {
			h.put(i, h.getOrDefault(i,0)+1);
			if(h.get(i)>s.length()/2+1 || h.get(i)==s.length()) {
				System.out.print("Not possible");
				return;
				
			}
		}
		String res="";
		pq.addAll(h.keySet());
		while(pq.size()>1) {
			char ch1=pq.poll();
			char ch2 =pq.poll();
			
		
			if(h.get(ch1)>1) {
				h.put(ch1, h.get(ch1)-1);
				pq.add(ch1);
			}
			if(h.get(ch2)>1) {
				h.put(ch2, h.get(ch2)-1);
				pq.add(ch2);
			}
	      res+=ch1;
	      res+=ch2;
	      
			
			
			
		}
		
        
        	
        
        System.out.print(res);
		

		
		

	}

}
