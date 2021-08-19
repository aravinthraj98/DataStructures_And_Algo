package StackProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterVals {
       static void mergeInterval(int[][] interval) {
    	   Arrays.sort(interval,(a,b)->a[0]-b[0]);
    	  Stack<int[]> s=new Stack<>();
    	  s.push(interval[0]);
    	   for(int i=1;i<interval.length;i++) {
    		 int[] temp =s.peek();
    		 if(temp[1]<interval[i][0]) {
    			 s.push(interval[i]);
    		 }
    		 else {
    			 temp[1]=interval[i][1];
    			 s.pop();
    			 s.push(temp);
    		 }
//    		 else if(temp[1]>interval[i][1]) {
//    			
//    		 }
    	   }
    	   while(s.isEmpty()==false) {
    		   int temp[]=s.pop();
    		   System.out.println(temp[0]+"-->"+temp[1]
    				   );
    	   }
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int interval[][] = {{6,8},{1,9},{2,4},{10,14}};
		 mergeInterval(interval);

	}

}
