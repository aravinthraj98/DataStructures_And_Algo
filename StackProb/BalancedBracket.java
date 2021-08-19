package StackProb;

import java.util.Stack;

public class BalancedBracket {
	static void isBalance(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
				stack.push(s.charAt(i));
			}
			else {
				
				if(s.charAt(i)=='}' && stack.pop()!='{') {
					System.out.print("no");
					return;
				}
				if(s.charAt(i)==']' && stack.pop()!='[') {
					System.out.print("no");
					return;
				}
				if(s.charAt(i)==')' && stack.pop()!='(') {
					System.out.print("no");
					return;
				}
				
			}
		}
		System.out.print("yes");
			}
	
	
	public static void main(String args[]) {
		String s ="{{[]}}";
		String s1 ="{{[()]}}[]";
		String s2 ="{{)(}}";
		isBalance(s);
		isBalance(s1);
		isBalance(s2);
	}

}
