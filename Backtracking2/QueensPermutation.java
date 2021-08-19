package Backtracking2;

import java.util.ArrayList;
import java.util.Arrays;

public class QueensPermutation {

  static void getPermutation(ArrayList<String> A,int N,int k,int i,int j,boolean visited[],String s) {
//if(i==j) return;

	  if(s.length()==k) {
		  if(i==j) return;
		  if(A.contains(s))return;
//		  if(A.size()==4) {
//			  System.out.print(A.toString());
//			  A.clear();
//		  }
		  
		  A.add(s);
		
		  return;
	  }
	  if(i>=N) return;
	
	  for(int m=0;m<N;m++) {
		  if(visited[m])continue;
		 visited[m]=true;
		  getPermutation(A,N,k,i,m,visited,s+i+m);
		 
		  getPermutation(A,N,k,i+1,m,visited,s);
		  visited[m]=false;
		 
		 
		  
	
	  }
	  
//	 getPermutation(A,N,k,i+1,j,visited,s);
//	 getPermutation(A,N,k,i,j+1,visited,s);
//	 getPermutation(A,N,k,i,j,visited,s+i+j);
	
//	 getPermutation(A,N,k,i,j,visited,s+i+j);
	  
	
	  
	  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		int k=2;
		ArrayList<String> A=new ArrayList<>();
		boolean[] visited = new boolean[N+1];
//		getPermutation(A,N,k,0,"",visited);
		getPermutation(A,N,k,0,0,visited,"");
		System.out.print(A.toString());
		


	}

}
