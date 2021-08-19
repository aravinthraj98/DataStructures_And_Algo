package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//You are given a graph with n nodes and m directed edges. One lowercase letter is assigned to each node. We define a path's value as the number of the most frequently occurring letter. For example, if letters on a path are "abaca", then the value of that path is 3. Your task is find a path whose value is the largest.
//
//Input
//The first line contains two positive integers n,m (1≤n,m≤300000), denoting that the graph has n nodes and m directed edges.
//
//The second line contains a string s with only lowercase English letters. The i-th character is the letter assigned to the i-th node.
//
//Then m lines follow. Each line contains two integers x,y (1≤x,y≤n), describing a directed edge from x to y. Note that x can be equal to y and there can be multiple edges between x and y. Also the graph can be not connected.
//
//Output
//Output a single line with a single integer denoting the largest value. If the value can be arbitrarily large, output -1 instead.
class edgePair{
	int dest;char weight;
	edgePair(int dest,char weight){
		this.dest=dest;
		this.weight=weight;
	}
}
public class codeforceSubstring {
	 static int max=0;
	static void addEdge(int u,int v,char ch,ArrayList<ArrayList<edgePair>> A ) {
		A.get(u).add(new edgePair(v,ch));
	}
	static void bfs(int src,boolean visited[],HashMap<Character,Integer> H ,ArrayList<ArrayList<edgePair>> A) {
		Queue<Integer> q=new LinkedList<>();
		q.add(src);
		visited[src]=true;
		while(!q.isEmpty()) {
			int temp=q.poll();
			for(edgePair neighbour:A.get(temp)) {
				if(!visited[neighbour.dest]) {
					q.add(neighbour.dest);
					if(H.containsKey(neighbour.weight)) {
						int count=H.get(neighbour.weight);
						count=count+1;
				        H.put(neighbour.weight,count);
				        max=max>count?max:count;
					}
					else {
						 H.put(neighbour.weight,1);
					}
				}
				visited[neighbour.dest]=true;
			}
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int e = sc.nextInt();
		String s = sc.next();
		ArrayList<ArrayList<edgePair>> A = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			A.add(new ArrayList<edgePair>());
		}
		for(int i=0;i<e;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			addEdge(u,v,s.charAt(v-1),A);
		}
		boolean visited[]=new boolean[n+1];
	   
	    HashMap<Character,Integer> H ;
		for(int i=1;i<=n;i++) {
			if(visited[i])continue;
			  H= new HashMap<>();
			  Arrays.fill(visited, false);
			H.put(s.charAt(i-1),1);
			if(max==0) max=1;
			bfs(i,visited,H,A);
			
		}
		System.out.print(max);
		
	}

}
