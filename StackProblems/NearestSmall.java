package StackProblems;

import java.util.Stack;

public class NearestSmall {
	static void findNearestSmallLeft(int arr[]) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(stack.isEmpty()==false && stack.peek()>=arr[i]) {
				stack.pop();
			}
			int value = stack.isEmpty()?-1:stack.peek();
			stack.push(arr[i]);
			arr[i]=value;
		}
		
		
	}
	static void findNearestSmallRight(int arr[]) {
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(stack.isEmpty()==false && stack.peek()>=arr[i]) {
				stack.pop();
			}
			int value = stack.isEmpty()?-1:stack.peek();
			stack.push(arr[i]);
			arr[i]=value;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[]= {1,5,2,9,2};
           findNearestSmallRight(arr);
           for(int i:arr) {
        	   System.out.print(i+" ");
           }
	}

}
