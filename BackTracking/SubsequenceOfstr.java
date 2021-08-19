package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;


public class SubsequenceOfstr {
	private static void subsequence(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		subsequence(ros, ans + "");
		subsequence(ros, ans + ch);		
	}
       static void FindSub(ArrayList<String> A,String s,String sub,int size,boolean visited[]) {
    	
    	   if(sub.length()==size) {
    		   if(!A.contains(sub))A.add(sub);
    		  
    		    
    		   return;
    	   }
    	   for(int i=0;i<=s.length()-size;i++) {
    		   if(!visited[i]) {
    			   visited[i]=true;
    			   sub=s.substring(i,i+size);
        		   FindSub(A,s,sub,size,visited);
        		   sub=s.substring(i+1);
        		   
        		   
    		   }
    	   }
    		   if(size<=s.length()) {
    			   Arrays.fill(visited, false);
    			   FindSub(A,s,sub,size+1,visited);
    		   }
    		 
               
        		   
    		   
    		 
    		   
    	   
    	  
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> A = new ArrayList<>();
         String s="pmbk";
         boolean[] visited=new boolean[s.length()];
//         for(int i=1;i<=s.length();i++) {
        	 Arrays.fill(visited, false);
        	 FindSub(A,s,"",1,visited);
        	 
         
//        subsequence(s,"");
         System.out.print(A.toString());
	}

}
