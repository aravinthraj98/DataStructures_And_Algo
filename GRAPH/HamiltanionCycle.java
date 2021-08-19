package GRAPH;

import java.util.ArrayList;

public class HamiltanionCycle {
	static int size=4;
	static boolean visited[] =new boolean[size];
	static ArrayList<Integer> path=new ArrayList<>();
  static boolean isHamiltanion(ArrayList<ArrayList<Integer>> A,int src) {
	  if(src==size)
		   return true;
	  for(int i:A.get(src)) {
		  if(!visited[i]) {
			  visited[i]=true;
			  path.add(i);
			  if(isHamiltanion(A,src+1)) return true;
			  visited[i]=false;
			  path.remove(Integer.valueOf(i));
		  }
	  }
	  return false;
	  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for(int i=0;i<size;i++) {
			A.add(new ArrayList<Integer>());
			
		}
		A.get(0).add(1);
//		A.get(1).add(0);
		A.get(1).add(2);
//		A.get(2).add(1);
		A.get(2).add(3);
//		A.get(3).add(2);
		A.get(3).add(0);
//		A.get(1).add(3);
		System.out.print(isHamiltanion(A,0));
		System.out.print(path.toString());
		

	}

}
