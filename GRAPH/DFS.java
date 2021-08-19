package GRAPH;



import java.util.*;

public class DFS {
	static int size =5;
	static void addEdge(ArrayList<ArrayList<Integer>> A,int u,int v) {
	A.get(u).add(v);
	}
	static void traverse(ArrayList<ArrayList<Integer>> A,Stack<Integer> Q,int s) {
		boolean arr[]=new boolean[size];
		Q.add(s);
		arr[s]=true;
		
		while(!Q.isEmpty()) {
			int temp =Q.pop();
			System.out.print(temp);
			for(int i=0;i<A.get(temp).size();i++) {
				int temp1=A.get(temp).get(i);
				if(!arr[temp1]) {
					Q.push(temp1);
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
		Stack<Integer> stack= new Stack<Integer>();
		  addEdge(A,1, 0);
	      addEdge(A,0, 2);
	      addEdge(A,2, 1);
	   
	      addEdge(A,0, 3);
	      addEdge(A,1, 4);
	      traverse(A,stack,0);
	}

}

