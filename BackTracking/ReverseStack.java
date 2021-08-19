package BackTracking;

import java.util.Stack;

public class ReverseStack {
	static void reverse(Stack<Integer> stack) {
		if(stack.size()==1) {
			return;
		}
		int top=stack.pop();
		reverse(stack);
		insert(stack,top);
	    
	    
		
	}
	static void insert(Stack<Integer> stack,int top) {
		if(stack.size()==0) {
			stack.push(top);
			return;
		}
		int last = stack.pop();
		insert(stack,top);
		stack.push(last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.print(stack);
		reverse(stack);
		System.out.print(stack);
		

	}

}
