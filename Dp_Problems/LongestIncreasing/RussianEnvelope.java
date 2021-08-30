package Dp_Problems.LongestIncreasing;

import java.util.Arrays;

//you are given the number of envelops as 2d array each index containing the w,h array...
//You have to fit the envelopes one inside another
//Solution:
//Longest Increasing sequence
public class RussianEnvelope {
	  static int getCount(int[][] arr,int n) {
		  int dp[] = new int[n];
		  dp[0]=1;
		  int result=0;
		  for(int i=1;i<n;i++) {
			  int max=0;
			  for(int j=0;j<n;j++) {
				  if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]) {
					  max=Math.max(max, dp[j]);
				  }
			  }
			  dp[i]=max+1;
			  result=Math.max(result, dp[i]);
			  
		  }
		  return result;
	  }
	public static void main(String args[]) {
		int arr[][] = {{5,4},{6,2},{6,7},{7,9}};
		Arrays.sort(arr,(a,b)->a[0]-b[0]);
		
		System.out.print("GetCountOfEnvelope"+getCount(arr,arr.length));
	}

}
