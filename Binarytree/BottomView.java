package Binarytree;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;



public class BottomView {
	

	

	static void BottomView(BinaryNode root) {
		Map<Integer,BinaryNode> h = new TreeMap<>();
		Queue<TreeObject> q = new LinkedList<>();
		q.add(new TreeObject(0,root));
		while(!q.isEmpty()) {
			TreeObject temp = q.poll();
			
				h.put(temp.n,temp.b);
				
			
			if(temp.b.left!=null) {
				q.add(new TreeObject(temp.n-1,temp.b.left));
			}
			if(temp.b.right!=null) {
				q.add(new TreeObject(temp.n+1,temp.b.right));
			}
			
		}
		
	
		for(Map.Entry<Integer, BinaryNode> entry :h.entrySet()) {
			System.out.print(entry.getValue().data+" ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryNode root = new BinaryBinaryNode(1);
		   BinaryNode root = new BinaryNode(20);
	        root.left = new BinaryNode(8);
	        root.right = new BinaryNode(22);
	        root.left.left = new BinaryNode(5);
	        root.left.right = new BinaryNode(3);
	        root.right.left = new BinaryNode(4);
	        root.right.right = new BinaryNode(25);
	        root.left.right.left = new BinaryNode(10);
	        root.left.right.right = new BinaryNode(14);
        BottomView(root);
		

	}

}

