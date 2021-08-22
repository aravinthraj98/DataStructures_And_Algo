package StackProblems;
import java.util.Stack;

public class NearestGreatest {
	static void findNearestGreatestLeft(int arr[]) {
		Stack<Integer> s = new Stack<>();
		
	    for(int i=0;i<arr.length;i++) {
	    	 while(!s.isEmpty() && s.peek()<=arr[i]) {
	    		 s.pop();
	    	 }
	    	int value=s.isEmpty()?-1:s.peek();
	    	 s.push(arr[i]);
	    	 arr[i]=value;
	    	 
	    }
	}
	static void findNearestGreatestRight(int arr[]) {
Stack<Integer> s = new Stack<>();
		
	    for(int i=arr.length-1;i>=0;i--) {
	    	 while(!s.isEmpty() && s.peek()<=arr[i]) {
	    		 s.pop();
	    	 }
	    	int value=s.isEmpty()?-1:s.peek();
	    	 s.push(arr[i]);
	    	 arr[i]=value;
	    	 
	    }
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,23,12,5,12};
		findNearestGreatestRight(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		

	}

}
