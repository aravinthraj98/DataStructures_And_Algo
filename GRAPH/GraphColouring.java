package GRAPH;

import java.util.ArrayList;

public class GraphColouring {
	static int size =4;
	static int[] colour = new int[size];
	static ArrayList<ArrayList<Integer>> A;
	static void addEdge(int u,int v) {
		A.get(u).add(v);
		A.get(v).add(u);
	}
	static int NoofPermutation =0;
	static void colorPermutation(int n,int v) {
		if(v==size) {
			NoofPermutation+=1;
			return;
		}
		for(int i=1;i<=n;i++) {
			if(isValid(i,v)) {
				colour[v]=i;
				colorPermutation(n,v+1);
				colour[v]=0;
				
				
			}
		}
	}
	static boolean IsgraphColoring(int n,int v) {
		if(v==size)
			 return true;
		for(int i=1;i<=n;i++) {
			if(isValid(i,v)) {
				colour[v]=i;
				if(IsgraphColoring(n,v+1)) {
					return true;
				}
				colour[v]=0;
			}
		}
		return false;
	}
	
	static boolean isValid(int color,int src) {
		for(int neighbours:A.get(src)) {
			if(colour[neighbours]==color) {
				return false;
			}
			
		}
		return true;
	}
 public static void main(String args[]) {
	 A=new ArrayList<>();
	 for(int i=0;i<size;i++) {
		 A.add(new ArrayList<Integer>());
	 }
	 
	 addEdge(1,2);
	 addEdge(2,3);
	 addEdge(3,1);
	 addEdge(3,0);
	 System.out.print("Coloring using 3 colours "+ IsgraphColoring(3,0));
	 System.out.print("\nColoring using 2 colours "+ IsgraphColoring(2,0));
	 colorPermutation(3,0);
	 System.out.print("\nNo of permutation"+NoofPermutation);
	 NoofPermutation=0;
	 colorPermutation(2,0);
	 System.out.print("\nNo of permutation"+NoofPermutation);
	 //color optimization to be done;
 }
}
