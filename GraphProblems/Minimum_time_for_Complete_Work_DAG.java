package GraphProblems;

import java.util.ArrayList;
import java.util.*;

public class Minimum_time_for_Complete_Work_DAG {
	static int v=11;
	static int indegree[] = new int[v];
	static int result[] = new int[v];
	static ArrayList<ArrayList<Integer>> A;
	static void addEdge(int u,int v) {
		A.get(u).add(v);
		indegree[v]++;
	}
	static void FindMinimumTime() {
		Queue<Integer> Q = new LinkedList<>();
		for(int i=0;i<v;i++) {
			if(indegree[i]==0) {
				Q.add(i);
				result[i]=1;
			}
		}
		while(!Q.isEmpty()) {
			int parent=Q.poll();
			for(int adj:A.get(parent)) {
				indegree[adj]--;
				if(indegree[adj]==0) {
					result[adj]=result[parent]+1;
					Q.add(adj);
				}
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A = new ArrayList<>();
	for(int i=0;i<v;i++) {
		A.add(new ArrayList<Integer>());
	}
		Arrays.fill(indegree, 0);
		   addEdge(1, 3);
		    addEdge(1, 4);
		    addEdge(1, 5);
		    addEdge(2, 3);
		    addEdge(2, 8);
		    addEdge(2, 9);
		    addEdge(3, 6);
		    addEdge(4, 6);
		    addEdge(4, 8);
		    addEdge(5, 8);
		    addEdge(6, 7);
		    addEdge(7, 8);
		    addEdge(8, 10);
		    FindMinimumTime();

	}

}
