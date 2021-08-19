package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class TopologicalSort {

	static int size =5;
	static int indegree[]=new int[size];
	static void addEdge(ArrayList<ArrayList<Integer>> A,int u,int v) {
	A.get(u).add(v);
	indegree[v]+=1;
	
	}
	static void kahnAlgo(ArrayList<ArrayList<Integer>> A) {
		int[] result = new int[size];
		int i=0;
		Arrays.fill(result,-1);
		
		Queue<Integer> Q = new LinkedList<>();
	  for(int k=0;k<size;k++) {
		  if(indegree[k]==0) {
			  Q.add(k);
			 
		  }
	  }
		while(!Q.isEmpty()) {
			int temp = Q.poll();  
			
			for(int neighbour:A.get(temp)) {
				indegree[neighbour]--;
				if(indegree[neighbour]==0) {
					Q.add(neighbour);
				}
			}
			result[i]=temp;
			i++;
			
			
			
		}
		for(int j=0;j<result.length;j++) {
			if(result[i]==-1) {
				System.out.print("there is a cycle in graph");
				return;
			}
			
		}
		System.out.print(result.toString());
		
	}
	static void topology(int i,ArrayList<ArrayList<Integer>> A,boolean[] visited,Stack<Integer> S) {
		visited[i]=true;
		for(int neighbours:A.get(i)) {
			if(!visited[neighbours]) {
				topology(neighbours,A,visited,S);
			}
		}
		S.push(i);
	}
	static void dfsAlgo(ArrayList<ArrayList<Integer>> A,int v) {
		Stack<Integer> S = new Stack<Integer>();
		boolean[] visited = new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				topology(i,A,visited,S);
			}
		}
		while(S.isEmpty()==false) {
			System.out.println(S.pop());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<>(size);
		for(int i=0;i<size;i++) {
			A.add(new ArrayList<Integer>());  
		}
		Arrays.fill(indegree,0);
		Stack<Integer> stack= new Stack<Integer>();
	
		  addEdge(A,1, 0);
	      addEdge(A,0, 2);
	      addEdge(A,2,1);
//	      addEdge(A,2, 3);
//	   
//	      addEdge(A,0, 3);
//	      addEdge(A,1, 4);
	      kahnAlgo( A);
	      dfsAlgo(A,3);
	     
	      
	      
	     

	}

}