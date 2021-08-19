package BackTracking;

import java.util.ArrayList;

public class Nqueen {
static ArrayList<String> A = new ArrayList<>();
   static void getCombination(int N,int i,int j,boolean[] diagnolL,boolean[] diagnolR,boolean[] vertical,boolean[] horizontal) {
	   if(i>N ) {
		   System.out.print(A.toString());
		 return;
	   }
	   
	 
		    
	  
	  
	
	   
	 for(int k=1;k<=N;k++) {
		 
		 if(vertical[k] ||horizontal[i] || diagnolR[N+i-k] || diagnolL[i+k-1]) continue;
		 vertical[k]=horizontal[i]=diagnolR[N+i-k]=diagnolL[i+k-1]=true;  
		  A.add(i+" "+k);
		  
		 getCombination(N,i+1,k,diagnolL,diagnolR,vertical,horizontal);
		   vertical[k]=horizontal[i]=diagnolR[N+i-k]=diagnolL[i+k-1]=false; 
		   A.remove(i+" "+k);
	 }
//	   getCombination(N,i+1,j,diagnolL,diagnolR,vertical,horizontal);
//	   getCombination(N,i,j+1,diagnolL,diagnolR,vertical,horizontal);
//	   getCombination(N,i+1,j+1,diagnolL,diagnolR,vertical,horizontal);
	   
	   
	
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int N=4;
      boolean diagnolL[] = new boolean[2*N];
      boolean diagnolR[]=new boolean[2*N];
      boolean vertical[]=new boolean[N+1];
      boolean horizontal[]=new boolean[N+1];
      getCombination(N,1,1,diagnolL,diagnolR,vertical,horizontal);
     
      
      
      
      
	}

}
