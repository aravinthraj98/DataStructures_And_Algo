package Binarytree;

import java.util.Stack;

public class Inorder {
	 static void printRecursive(BinaryNode node) {
		if(node==null) {
			return;
		}
		printRecursive(node.left);
		System.out.print(node.data);
		printRecursive(node.right);
	}
	 static void printIterative(BinaryNode root) {
		 Stack<BinaryNode> s=new Stack<BinaryNode>();
		 BinaryNode node = root;
		
		 while(node!=null || !s.isEmpty()) {
			 if(node!=null) {
				 s.push(node);
				 node=node.left;
			 }
			 else {
				if(!s.isEmpty()) {
							node =s.pop();
						 System.out.print(node.data);
						 node=node.right;
				}
				
				 
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
        System.out.println();
        printIterative(root);
        
        

	}

}
