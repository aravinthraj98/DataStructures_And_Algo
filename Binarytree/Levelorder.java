package Binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Levelorder {
	static void LevelOrder(BinaryNode root) {
		Queue<BinaryNode> q = new LinkedList<BinaryNode>();
		q.add(root);
		while(q.isEmpty()==false) {
			BinaryNode temp =q.poll();
			System.out.print(temp.data);
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);
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
        LevelOrder(root);


	}

}
