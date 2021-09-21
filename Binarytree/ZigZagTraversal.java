package Binarytree;

import java.util.Stack;

public class ZigZagTraversal {
	static void ZigZag(BinaryNode root) {
		Stack<BinaryNode> s1= new Stack<BinaryNode>();
		Stack<BinaryNode> s2= new Stack<BinaryNode>();
		s1.add(root);
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				BinaryNode s=s1.pop();
				System.out.print(s.data);
				if(s.left!=null)s2.add(s.left);
				if(s.right!=null)s2.add(s.right);
				
			}
			while(!s2.isEmpty()) {
				BinaryNode s=s2.pop();
				System.out.print(s.data);
				if(s.right!=null)s1.add(s.right);
				if(s.left!=null)s1.add(s.left);
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNode root = new BinaryNode(1);
        root.left = new BinaryNode(2);
        root.right = new BinaryNode(3);
        root.left.left = new BinaryNode(4);
        root.right.left = new BinaryNode(5);
        root.right.right = new BinaryNode(6);
        root.right.left.left = new BinaryNode(7);
        root.right.left.right = new BinaryNode(8);
        ZigZag(root);

		

	}

}
