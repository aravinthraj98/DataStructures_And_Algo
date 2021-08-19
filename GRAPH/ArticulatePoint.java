package GRAPH;
import java.util.*;

public class ArticulatePoint {
	static int size=5;
	static void addEdge(ArrayList<ArrayList<Integer>> A,int u,int v) {
		A.get(u).add(v);
		}
	static int result[]=new int[size];
	static int trackResult =0;
	static int disc[] = new int[size];
	static int low[] = new int[size];
	static int parent[]=new int[size];
	static int time=0;
	
	static boolean visited[]=new boolean[size];
	
	static void traverse(ArrayList<ArrayList<Integer>> A,int u) {
		visited[u] =true;
		disc[u]=low[u]=time+1;
		time++;
		int child=0;
		for(int neighbours:A.get(u)) {
			if(!visited[neighbours]) {
				child++;
				parent[neighbours]=u;
				traverse(A,neighbours);
				if(parent[u]==-1 && child>1) {
					result[trackResult]=u;
					trackResult++;
				}
				if(parent[u]!=-1 && low[neighbours]>=  disc[u]) {
		
					result[trackResult]=u;
					trackResult++;
				}
				
				
			}
			else if(neighbours!=parent[u]){
				
				low[u]=Math.min(low[u], disc[neighbours]);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
	    for(int i=0;i<size;i++) {
	    	A.add(new ArrayList<Integer>());
	    }
	    Arrays.fill(disc, 0);
	    Arrays.fill(parent, -1);
	    addEdge(A,1, 0);
	      addEdge(A,0, 2);
	      addEdge(A,2, 1);
	   
	      addEdge(A,0, 3);
	      addEdge(A,1, 4);
	      traverse(A,0);
	      for(int i=0;i<trackResult;i++) {
	    	  System.out.println(result [i]);
	      }

	}

}
