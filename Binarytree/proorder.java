package Binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class proorder {
	static void printRecursive(BinaryNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data);
		printRecursive(node.left);
		printRecursive(node.right);
	}
	static void printIterative(BinaryNode node) {
		Stack<BinaryNode> s = new Stack<BinaryNode>();
		s.add(node);
		while(!s.isEmpty()) {
			node=s.pop();
			System.out.print(node.data);
			if(node.right!=null) {
				s.push(node.right);
			}
			if(node.left!=null) {
				s.push(node.left);
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
        printRecursive(root);
        System.out.print("\n");
        printIterative(root);

	}

}
