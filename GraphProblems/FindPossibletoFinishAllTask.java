package GraphProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//detecting cycle is enough

public class FindPossibletoFinishAllTask {
	static int size=2;
	static int[] indegree = new int[size];
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>>  A =new ArrayList<>();
		for(int i=0;i<size;i++) {
			A.add(new ArrayList<Integer>);
			
		}
		

	}

}
