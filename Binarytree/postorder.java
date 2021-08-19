package Binarytree;



import java.util.Stack;

public class postorder {
	 static void printRecursive(BinaryNode node) {
		if(node==null) {
			return;
		}
		printRecursive(node.left);
		
		printRecursive(node.right);
		System.out.print(node.data);
	}
	 static void printIterative(BinaryNode root) {
		 Stack<BinaryNode> s=new Stack<BinaryNode>();
		 BinaryNode node = root;
		 Stack<Integer> out = new Stack<Integer>();
		 s.push(node);
		 while(!s.isEmpty()) {
			 node=s.pop();
			 out.push(node.data);
			 if(node.left!=null) {
				 s.push(node.left);
			 }
			 if(node.right!=null) {
				 s.push(node.right);
			 }
			 
			 
		
		 }
		 while(!out.isEmpty()) {
			 System.out.print(out.pop());
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
