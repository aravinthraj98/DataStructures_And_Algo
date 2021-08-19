package SlidingAlgo;

import java.util.HashMap;

public class FindWindowSize {
           static void findWindowSize(HashMap<Character,Integer> h,String s ,String k) {
        	   for(char i:k.toCharArray()) {
        		   h.put(i, h.getOrDefault(i,0)+1);
        			   
        		   
        	   }
        	   String res="";
        	   int j=0;
        	   int count=h.size();
        	   for(int i=0;i<s.length();i++) {
        		   char ch=s.charAt(i);
        		   if(h.containsKey(ch)) {
        			   h.put(ch, h.get(ch)-1);
        			   if(h.get(ch)==0)count--;
        		   }
        		   while(count==0) {
        			   int windowSize = i-j+1;
        			   if(res.equals("") || windowSize<res.length()) {
        				   res=s.substring(j,i+1);
        				  }
        			   char c =s.charAt(j);
        			   if(h.containsKey(c)) {
        				   h.put(c,h.get(c)+1);
        				   if(h.get(c)>0)count++;
        			   }
        			   j++;
        		   }
        	   }
        	   System.out.print(res);
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res ="timetopractice";
		String key ="toc";
		HashMap<Character,Integer> h= new HashMap<>();
		findWindowSize(h,res,key);
		

	}

}
