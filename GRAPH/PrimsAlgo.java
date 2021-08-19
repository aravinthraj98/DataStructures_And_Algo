package GRAPH;

import java.util.ArrayList;
import java.util.PriorityQueue;
class PairPrim{
	int src;
	int weight;
	PairPrim(int src,int weight){
		this.weight=weight;
		this.src=src;
	}
}
class NodePrim implements Comparable<NodePrim>{
	int weight;
	int src;
	int parent;
	NodePrim(int weight,int parent,int src){
		this.weight=weight;
		this.parent=parent;
		this.src=src;
		
	}
	@Override
	public int compareTo(NodePrim other) {
		return this.weight-other.weight;
	}
}
public class PrimsAlgo  {
	
	static ArrayList<NodePrim> result;
	static void PrimsAlgo(ArrayList<ArrayList<PairPrim>> A,int n) {
	
		boolean visited[]=new boolean[n];
		
		PriorityQueue<NodePrim> minHeap = new PriorityQueue<>();
		minHeap.add(new NodePrim(0,-1,0));
		while(minHeap.isEmpty()==false) {
			NodePrim u=minHeap.poll();
			if(!visited[u.src]) {
				result.add(u);
				visited[u.src]=true;
				for(PairPrim adj:A.get(u.src)) {
					if(!visited[adj.src]) {
						minHeap.add(new NodePrim(adj.weight,u.src,adj.src));
					}
				}
			}
		}
		
		for(NodePrim res:result) {
			System.out.println(res.weight+"=>"+res.parent+"=>"+res.src);
		}
	}
	static void PrimAlgoBruteForce(ArrayList<ArrayList<PairPrim>> A,int n) {
		int weight[] = new int[n];
		int parent[] =new int[n];
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			weight[i]=Integer.MAX_VALUE;
			parent[i]=-1;
		}
		weight[0]=0;
		for(int i=0;i<n-1;i++) {
			int min = Integer.MAX_VALUE;
			int src =0;
			for(int v=0;v<n;v++) {
				if(visited[v]==false && weight[i]<min) {
					min=weight[v];
					src=v;
					
				}
			}
			visited[src]=true;
			for(PairPrim neighbours:A.get(src)) {
				if(!visited[neighbours.src] && neighbours.weight<weight[neighbours.src]) {
					parent[neighbours.src]=src;
					weight[neighbours.src]=neighbours.weight;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(weight[i]+"=>"+parent[i]+"=>"+i);
		}
	}
   

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		ArrayList<ArrayList<PairPrim>> A= new ArrayList<>();
		for(int i=0;i<n;i++) {
			A.add(new ArrayList<PairPrim>());
		}
		result=new ArrayList<>();
		A.get(0).add(new PairPrim(1, 10));
		A.get(0).add(new PairPrim(3, 40));
		
		A.get(1).add(new PairPrim(2, 10));
		
		A.get(2).add(new PairPrim(3, 10));
		
		A.get(3).add(new PairPrim(4, 2));
		
		A.get(4).add(new PairPrim(5, 3));
		
		A.get(4).add(new PairPrim(6, 8));
		
		A.get(5).add(new PairPrim(6, 3));
		PrimsAlgo(A,n);
		System.out.print("=====================================");
		
		PrimAlgoBruteForce(A,n);
		

	}

}
