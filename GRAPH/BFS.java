package GRAPH;

import java.util.*;

public class BFS {
	static int size =4;
	static void addEdge(ArrayList<ArrayList<Integer>> A,int u,int v) {
	A.get(u).add(v);
	}
	static void traverse(ArrayList<ArrayList<Integer>> A,Queue<Integer> Q,int s) {
		boolean arr[]=new boolean[size];
		Q.add(s);
		arr[s]=true;
		
		while(!Q.isEmpty()) {
			int temp =Q.poll();
			System.out.print(temp);
			for(int i=0;i<A.get(temp).size();i++) {
				int temp1=A.get(temp).get(i);
				if(!arr[temp1]) {
					Q.add(temp1);
					arr[temp1]=true;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<>(size);
		for(int i=0;i<size;i++) {
			A.add(new ArrayList<Integer>());  
		}
		Queue<Integer> Q = new LinkedList<Integer>();
		  addEdge(A,0, 1);
	      addEdge(A,0, 2);
	      addEdge(A,1, 2);
	      addEdge(A,2, 0);
	      addEdge(A,2, 3);
	      addEdge(A,3, 3);
	      traverse(A,Q,2);
	}

}
