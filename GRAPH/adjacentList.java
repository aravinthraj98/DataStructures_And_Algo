package GRAPH;

import java.util.ArrayList;

public class adjacentList {
	static void addVertices(ArrayList<ArrayList<Integer>> A ,int u,int v) {
		A.get(u).add(v);
		A.get(v).add(u);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size =5;
		ArrayList<ArrayList<Integer>> A = new ArrayList<>(size);
		for(int i=0;i<size;i++) {
			A.add(new ArrayList<Integer>());
		}
		 addVertices(A,0,1);
		 addVertices(A,0,2);
		 addVertices(A,1,3);
		 addVertices(A,1,2);
		
		 addVertices(A,2,3);
		 addVertices(A,2,4);
		
		 addVertices(A,3,4);
		 
		
		 addVertices(A,4,0);
		 
		 for(int i=0;i<size;i++) {
			 for(int j=0;j<A.get(i).size();j++) {
				 System.out.print(A.get(i).get(j)+"---->");
			 }
			 System.out.print("\n");
		 }
	

	}

}
