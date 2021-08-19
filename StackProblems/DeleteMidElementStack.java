package StackProblems;

import java.util.Stack;

public class DeleteMidElementStack {
            static void deleteMid(Stack<Integer> S) {
            	int mid = S.size()/2+1;
            	
            	removeMid(S,mid);
            }
            static void removeMid(Stack<Integer> S,int mid) {
            	if(mid==1) {
            		S.pop();
            		return;
            	}
            	int temp = S.pop();
            	removeMid(S,mid-1);
            	S.push(temp);
//            	System.out.print(S.size());
            	return;
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		deleteMid(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}

	}

}
