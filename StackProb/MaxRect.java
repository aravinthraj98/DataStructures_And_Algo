package StackProb;



import java.util.Stack;

public class MaxRect {
	static void findNearGreat(int arr[]) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && stack.peek()>arr[i]) {
				stack.pop();
			}
			if(!stack.isEmpty()) {
				System.out.print(stack.peek()+" ");
			}
			else {
				System.out.print(-1+" ");
			}
			stack.push(arr[i]);
		}
	}
	static void findNearSmall(int arr[]) {
		System.out.print("\n");
		
			Stack<Integer> stack = new Stack<>();
			for(int i=arr.length-1;i>=0;i--) {
				while(!stack.isEmpty() && stack.peek()>arr[i]) {
					stack.pop();
				}
				if(!stack.isEmpty()) {
					System.out.print(stack.peek()+" ");
				}
				else {
					System.out.print(-1+" ");
				}
				stack.push(arr[i]);
			}
		
	}
	public static void main(String args[]) {
		int arr[]= {6,2,5,4,5,1,6};
		findNearGreat(arr);
		findNearSmall(arr);
		
	}

}

