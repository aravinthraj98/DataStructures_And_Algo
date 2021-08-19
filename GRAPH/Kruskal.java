package GRAPH;
import java.util.*;
//graph which connects all the vertices with minimum edge weight
//
class Pair implements Comparable<Pair>{
	int src;
	   int dest;
	    int weight;
		Pair(int src,int dest,int weight){
			this.src=src;
			this.dest=dest;
			this.weight=weight;
		}
		@Override
		public int compareTo(Pair other) {
			return this.weight-other.weight;
		}
}
public class Kruskal {
static int size =5;
static int parent[]= new int[5];
static int rank[] = new int[5];
   static int find(int u) {
	   if(parent[u]!=u) {
		   parent[u]=find(parent[u]);
	   }
	   return parent[u];
   }
   static void union(int u,int v) {
	   int findX = find(u);
	   int findY =find(v);
	   if(rank[findX]<rank[findY]) {
		   parent[findX]=findY;
	   }
	   else if(rank[findX]>rank[findY]) {
		   parent[findY]=findX;
	   }
	   else {
		   parent[findX]=findY;
		    rank[findY]++;
	   }
   }
   static ArrayList<Pair> krusKal(ArrayList<Pair> A) {
	     Collections.sort(A);
	     ArrayList<Pair> result=new ArrayList<Pair>();
	     for(Pair pair:A) {
	    	 if(find(pair.src)!=find(pair.dest)) {
	    		 result.add(pair);
	    		 union(pair.src,pair.dest);
	    	 }
	     }
	     
	   return result;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pair> A = new ArrayList<Pair>();
	
		for(int i=0;i<size;i++) {
			parent[i]=i;
			rank[i]=0;
		}
		A.add(new Pair(0, 1, 2));
		A.add(new Pair(0, 3, 6));
		A.add(new Pair(1, 3, 8));
		A.add(new Pair(1, 2, 3));
		A.add(new Pair(1, 4, 5));
		A.add(new Pair(2, 4, 7));
		for(Pair pair :krusKal(A))
			  System.out.print("Pair"+pair.src+"==>"+pair.dest+"[weight]"+pair.weight);
		
		
		
		

	}

} 
