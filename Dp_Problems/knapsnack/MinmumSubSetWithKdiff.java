package Dp_Problems.knapsnack;

public class MinmumSubSetWithKdiff {
	
	static int minDiffRecursion(int arr[],int n,int sum1 ,int sum2) {
		if(n==0) {
			return Math.abs(sum1-sum2);
		}
		return Math.min(minDiffRecursion(arr,n-1,sum1+arr[n-1],sum2),minDiffRecursion(arr,n-1,sum1,sum2+arr[n-1]));
	}
	static int minDiffDp(int arr[]) {
		int totalSum =0;
		for(int i:arr) {
			totalSum+=i;
		}
		return getSubSet(totalSum,arr); 
	}
	  static int getSubSet(int n,int[] set) {
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
			int minDiff=Integer.MAX_VALUE;
		  for(int i=1;i<dp[0].length;i++) {

			  if(dp[dp.length-1][i]==true) {
				  if(i==7)System.out.print(dp[dp.length-1][i]);
				  minDiff=Math.min(minDiff, Math.abs(n-2*i));
			  }
		  }
		  return minDiff;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s1 +s2 =totalsum
		//s1-s2=min;
		//|2s1-totalsum|=min;
		int arr[] = { 1, 6, 11, 0 };
		System.out.print(minDiffDp(arr));
		System.out.print(minDiffRecursion(arr,arr.length,0,0));
		
		

	}

}
