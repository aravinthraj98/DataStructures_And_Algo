package Dp_Problems.knapsnack;


public class KnapSack {
	 static void printMatrix(boolean[][] dp) {
		   for(int i=0;i<dp.length;i++) {
			   for(int j=0;j<dp[0].length;j++) {
				   System.out.print(dp[i][j]+"  ");
			   }
			   System.out.print("\n");
		   }
	   }
   static int getSubSet(int n,int[] set,int[] weight) {
	   int dp[][]= new int[set.length+1][n+1];
	
	   for(int i=1;i<dp.length;i++) {
		   for(int j=1;j<dp[0].length;j++) {
			   if(j>=set[i-1]) {
				   int include=weight[i-1]+dp[i-1][j-set[i-1]];
				   int exclude=dp[i-1][j];
				   dp[i][j]=Math.max(include, exclude);
			   }
			   else {
				   dp[i][j]=dp[i-1][j];
			   }
		   }
	   }
	
	   return dp[set.length][n];
   }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int set[] = {1,2,4,5,6};
		int weight[]= {2,4,8,10,1};
		
	System.out.print("Is available" +getSubSet(n,set,weight));

		

	}

}
