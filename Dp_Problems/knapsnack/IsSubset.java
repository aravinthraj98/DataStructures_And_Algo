package Dp_Problems.knapsnack;

public class IsSubset {
	 static void printMatrix(boolean[][] dp) {
		   for(int i=0;i<dp.length;i++) {
			   for(int j=0;j<dp[0].length;j++) {
				   System.out.print(dp[i][j]+"  ");
			   }
			   System.out.print("\n");
		   }
	   }
   static boolean getSubSet(int n,int[] set) {
	   boolean dp[][]= new boolean[set.length+1][n+1];
	   for(int i=0;i<dp.length;i++) {
		   dp[i][0]=true;
		   
	   }
	   for(int i=1;i<dp.length;i++) {
		   for(int j=1;j<dp[0].length;j++) {
			     if(j>=set[i-1]) {
			    	 dp[i][j]=dp[i-1][j] || dp[i-1][j-set[i-1]];
			     }
			     else {
			    	 dp[i][j] = dp[i-1][j];
			     }
		   }
	   }
		printMatrix(dp);
	   return dp[set.length][n];
   }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int set[] = {1,2,4,5,6};
	System.out.print("Is available" +getSubSet(n,set));

		

	}

}
