package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;

class BellPair{
	int src;
	int dest;
	int weight;
	BellPair(int src,int dest,int weight){
		this.src=src;
		this.weight=weight;
		this.dest=dest;
	}
}
public class BellManFord {
	static ArrayList<BellPair> A;
	static void addEdge(int src,int dest,int weight) {
		A.add(new BellPair(src,dest,weight));
	}
	static void BellMan(int n) {
		int dist[] = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0]=0;
		for(int i=0;i<n-1;i++) {
			for(BellPair P :A) {
				if(dist[P.src]+P.weight<dist[P.dest]) {
					dist[P.dest]=dist[P.src]+P.weight;
				}
			}
		}
		for(BellPair P :A) {
			if(dist[P.src]+P.weight<dist[P.dest]) {
				System.out.print("Detected nagative");
				return;
			}
		}
		for(int i:dist) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A = new ArrayList<>();
		addEdge(0, 1, -1);
		addEdge(0, 2, 4);
		addEdge(1, 2, 3);
		addEdge(1, 3, 2);
		addEdge(1, 4, 2);
		addEdge(3, 2, 5);
		addEdge(3, 1, 1);
		addEdge(4, 3, -3);
		BellMan(5);
		
		

	}

}
