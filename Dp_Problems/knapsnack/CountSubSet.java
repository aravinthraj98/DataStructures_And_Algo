package Dp_Problems.knapsnack;



public class CountSubSet {
	 static void printMatrix(boolean[][] dp) {
		   for(int i=0;i<dp.length;i++) {
			   for(int j=0;j<dp[0].length;j++) {
				   System.out.print(dp[i][j]+"  ");
			   }
			   System.out.print("\n");
		   }
	   }
   static int getSubSet(int sum,int[] set,int i) {
	   if(sum==0)return 1;
	   if(sum<0 || i>=set.length)return 0;
	   return getSubSet(sum-set[i],set,i+1)+getSubSet(sum,set,i+1);
	   
	   
   }
   static int getSubSet(int n,int[] set) {
	   int dp[][]= new int[set.length+1][n+1];
	   for(int i=0;i<dp.length;i++) {
		   dp[i][0]=1;
		   
	   }
	   for(int i=1;i<dp.length;i++) {
		   for(int j=1;j<dp[0].length;j++) {
			     if(j>=set[i-1]) {
			    	 dp[i][j]=dp[i-1][j]+dp[i-1][j-set[i-1]];
			     }
			     else {
			    	 dp[i][j] = dp[i-1][j];
			     }
		   }
	   }
		
	   return dp[set.length][n];
   }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int set[] = {1,2,4,1,2};
	System.out.print("Is available" +getSubSet(n,set));
	System.out.print("\nrecursion"+getSubSet(n,set,0));

		

	}

}
