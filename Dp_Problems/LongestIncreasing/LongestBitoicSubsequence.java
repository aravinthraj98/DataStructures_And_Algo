package Dp_Problems.LongestIncreasing;
//Given an array of positive integers. Find the maximum length of Bitonic subsequence. 
//A subsequence of array is called Bitonic if it is first increasing, then decreasing.
//LBS = LIS+LBS-1;
public class LongestBitoicSubsequence {
	static int GetCountOfLBS(int[] arr,int n) {
		int lds[] = GetCountOfLDS(arr,n);
		int lis[] =GetCountOfLIS(arr,n);
		int max=0;
		for(int i=0;i<n;i++) {
			int res = lds[i]+lis[i]-1;
			max=Math.max(max, res);
		}
		return max;
		
	}
	 static int[]  GetCountOfLDS(int[] arr,int n) {
	    	
   	  int dp[] =  new int[n];
   	  dp[n-1]=1;
   	  int result = dp[0];
   	  for(int i=n-2;i>=0;i--) {
   		  int max=0;
//   		  System.out.print(Integer.MIN_VALUE);
   		  for(int j=i;j<n;j++) {
   			  if(arr[i]>arr[j]) {
   				  max=Math.max(max, dp[j]);
   			  }
   		  }
   		 dp[i]=max+1;
   		 result = Math.max(result, dp[i]);
   		 
   	  }
   	
   	 return dp;
     }
	    static int[]  GetCountOfLIS(int[] arr,int n) {
	  	
	  	  int dp[] =  new int[n];
	  	  dp[0]=1;
	  	  int result = dp[0];
	  	  for(int i=1;i<n;i++) {
	  		  int max=0;
//	  		  System.out.print(Integer.MIN_VALUE);
	  		  for(int j=0;j<i;j++) {
	  			  if(arr[i]>arr[j]) {
	  				  max=Math.max(max, dp[j]);
	  			  }
	  		  }
	  		 dp[i]=max+1;
	  		 result = Math.max(result, dp[i]);
	  		 
	  	  }
	 
	  	 return dp;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {50, 3, 10, 7, 40, 80};
//		int arr[] = {1, 11, 2, 10, 4, 5, 2, 1};
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80, 3,99};
		int n = arr.length;
		System.out.print(GetCountOfLBS(arr,n));
		
		

	}

}
