package GRAPH;
import java.util.*;
class Node implements Comparable<Node>{
	 int dest;
    int weight;
	Node(int dest,int weight){
		this.dest=dest;
		this.weight=weight;
	}
	@Override
	public int compareTo(Node other) {
		return this.weight-other.weight;
	}
}

public class djistraUsingPrirority {
	static int src=0;
	static void Djikstra(ArrayList<ArrayList<Node>> A,int n) {
		int dist[] = new int[n];
		for(int i = 0; i < n; i++)
			dist[i] = Integer.MAX_VALUE;
		PriorityQueue<Node> minQueue = new PriorityQueue<Node>();
		dist[src]=0;
		minQueue.add(new Node(src,0));
		while(!minQueue.isEmpty()) {
			Node temp=minQueue.poll();
			for(Node path:A.get(temp.dest)) {
				if(dist[temp.dest]+path.weight<dist[path.dest]) {
					dist[path.dest]=dist[temp.dest]+path.weight;
					minQueue.add(new Node(path.dest,dist[path.dest]));
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(dist[i]);
		}
		
	}
	public static void main(String args[]) {
		
	
	int n = 5;
	
	ArrayList<ArrayList<Node>> adj = new ArrayList<ArrayList<Node>>();
	
	for(int i = 0; i < n; i++)
		adj.add(new ArrayList<Node>());
	
	adj.get(0).add(new Node(1, 2));
	adj.get(1).add(new Node(0, 2));
	
	adj.get(1).add(new Node(2, 4));
	adj.get(2).add(new Node(1, 4));
	
	adj.get(0).add(new Node(3, 1));
	adj.get(3).add(new Node(0, 1));
	
	adj.get(3).add(new Node(2, 3));
	adj.get(2).add(new Node(3, 3));
	
	adj.get(1).add(new Node(4, 5));
	adj.get(4).add(new Node(1, 5));
	
	adj.get(2).add(new Node(4, 1));
	adj.get(4).add(new Node(2, 1));
	Djikstra(adj,n);
	
	}
	
	
}
