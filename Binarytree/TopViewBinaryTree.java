package Binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
class TreeObject{
	int n;
	BinaryNode b;
	TreeObject(int n,BinaryNode b){
		this.n=n;
		this.b=b;
	}
	
}

public class TopViewBinaryTree {
	

	

	static void TopView(BinaryNode root) {
		Map<Integer,BinaryNode> h = new TreeMap<>();
		Queue<TreeObject> q = new LinkedList<>();
		q.add(new TreeObject(0,root));
		while(!q.isEmpty()) {
			TreeObject temp = q.poll();
			if(!h.containsKey(temp.n)) {
				h.put(temp.n,temp.b);
				
			}
			if(temp.b.left!=null) {
				q.add(new TreeObject(temp.n-1,temp.b.left));
			}
			if(temp.b.right!=null) {
				q.add(new TreeObject(temp.n+1,temp.b.right));
			}
			
		}
		
	
		for(Map.Entry<Integer, BinaryNode> entry :h.entrySet()) {
			System.out.print(entry.getValue().data);
			
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
        TopView(root);
		

	}

}
