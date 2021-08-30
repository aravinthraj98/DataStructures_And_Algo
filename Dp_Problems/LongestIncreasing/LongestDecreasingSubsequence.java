package Dp_Problems.LongestIncreasing;



public class LongestDecreasingSubsequence {
      static int  GetCountOfLDS(int[] arr,int n) {
    	
    	  int dp[] =  new int[n];
    	  dp[0]=1;
    	  int result = dp[0];
    	  for(int i=1;i<n;i++) {
    		  int max=0;
//    		  System.out.print(Integer.MIN_VALUE);
    		  for(int j=0;j<i;j++) {
    			  if(arr[i]<arr[j]) {
    				  max=Math.max(max, dp[j]);
    			  }
    		  }
    		 dp[i]=max+1;
    		 result = Math.max(result, dp[i]);
    		 
    	  }
    	 return result;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 3, 10, 7, 40, 80};
		int n = arr.length;
		System.out.print(GetCountOfLDS(arr,n));

	}

}
