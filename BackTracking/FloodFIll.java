package BackTracking;

import java.util.ArrayList;

public class FloodFIll {
	static ArrayList<String> A = new ArrayList<>();
      static void FindPath(int flood[][],int u,int v,String res) {
    	  if(u==flood.length && v==flood[0].length) {
    		  A.add(res);return;
    	  }
    	  if(u>flood.length || v>flood[0].length) return;
    	  if(flood[u-1][v-1]==0) return;
    	  FindPath(flood,u,v+1,res+'H');
    	  FindPath(flood,u+1,v,res+'V');
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floodPath[][]= {{1,1,1,1},{1,0,1,1},{1,0,0,1}};
		FindPath(floodPath,1,1,"");
		System.out.print(A.toString());

	}

}
