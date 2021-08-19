  package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;
class DNODE{
	int weight;
	int dest;
	 DNODE(int dest,int weight){
		this.dest=dest;
		this.weight=weight;
	}
}
public class Djiksta {

	static int V=9;
	static int minDistance(int dist[],boolean[] b) {
		int min=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<V;i++) {
			if(dist[i]<=min && !b[i]) {
				min=dist[i];
				index=i;
			}
		}
		return index;
	}
	static void djikstra(int[][] graph,int src) {
		int dist[] =new int[V];
		boolean b[] = new boolean[V];
		for(int i=0;i<V;i++) {
			dist[i] =Integer.MAX_VALUE;
			
		}
		dist[src]=0;
		for(int j=0;j<V;j++) {
			int min = minDistance(dist,b);
			b[min]=true;
			for(int k=0;k<V;k++) {
				if(!b[k] && graph[min][k]!=0&& dist[min]!=Integer.MAX_VALUE &&graph[min][k]+dist[min]<dist[k]) {
					dist[k]=graph[min][k]+dist[min];
				}
			}
		}
		for(int l=0;l<V;l++) {
			System.out.println(l+"-->"+dist[l]);
		}
		
	}
	static void FormAdjacentList(int graph[][],  ArrayList<ArrayList<DNODE>> A) {
		
		for(int i=0;i<V;i++) {
			for(int j=0;j<graph[i].length;j++) {
				if(graph[i][j]!=0) {
				
					A.get(i).add(new DNODE(j,graph[i][j]));
				}
			}
		}
	
		
	}
	static void printAdjacentList(ArrayList<ArrayList<DNODE>> A) {
		for(int i=0;i<A.size();i++) {
			System.out.print("\n"+i+"==>");
			for(int j=0;j<A.get(i).size();j++) {
				System.out.print(A.get(i).get(j).dest+"<->"+A.get(i).get(j).weight+"===>");
			}
			
		}
	}
	static void djisktraUsingList( ArrayList<ArrayList<DNODE>> a) {
		int dist1[] = new int[V];
		boolean b[] = new boolean[V];
		Arrays.fill(dist1, Integer.MAX_VALUE);
		dist1[0]=0;
	
		for(int i=0;i<V;i++) {
			
			int u = minDistance(dist1,b);
			
			b[u] =true;
			
			for(int v=0;v<a.get(u).size();v++) {
				
				if(dist1[u]!=Integer.MAX_VALUE && dist1[u]+a.get(u).get(v).weight<dist1[a.get(u).get(v).dest]) {
					
					dist1[a.get(u).get(v).dest]=dist1[u]+a.get(u).get(v).weight;
					
				}
			}
		}
		
	for(int l=0;l<V;l++) {
		
			
			System.out.println(l+"---->"+dist1[l]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
              { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
              { 0, 8, 0, 7, 0,  4, 0, 0, 2 },
              { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
              { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
              { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
              { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
              { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
              { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
          
            
                 
          ArrayList<ArrayList<DNODE>> A= new ArrayList<ArrayList<DNODE>>(V);
          
          for(int i=0;i<V;i++) {
        	  A.add(new ArrayList<DNODE>());
          }
          FormAdjacentList(graph,A);
          printAdjacentList(A);
          djisktraUsingList(A);
          

	}

}
