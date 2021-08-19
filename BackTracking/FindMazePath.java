package BackTracking;

import java.util.ArrayList;

public class FindMazePath {
   static ArrayList<String> path= new ArrayList<>();
   static void getMaze(int n,int m,int dim,String s,boolean visited[][]) {
	   if(n==dim && m==dim) {
		   path.add(s);
		   return;
	   }
	   if(n>dim || m>dim) return;
	   
	   getMaze(n,m+1,dim,s+'H',visited);
	   getMaze(n+1,m,dim,s+'V',visited);
	   
	   
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dim=3;
		boolean visited[][]=new boolean[dim+1][dim+1];
        getMaze(1,1,2,"",visited);
        System.out.print(path.toString());
	}

}
