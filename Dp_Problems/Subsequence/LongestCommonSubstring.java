package Dp_Problems.Subsequence;



import java.util.Arrays;

public class LongestCommonSubstring {
	static int count=0;
	static int getWays(int n,int m,String m1 ,String m2,int count) {
		if(n==0 || m==0) return count;
		if(m1.charAt(n-1)==m2.charAt(m-1))count =getWays(n-1,m-1,m1,m2,count+1);
		
		
		return Math.max(count, Math.max(getWays(n,m-1,m1,m2,0), getWays(n-1,m,m1,m2,0)));
	}
//	
//	static int getWaysMemoize(int n,int m,String m1,String m2,int[][] dp) {
//		if(dp[n][m]!=-1)return dp[n][m];
//		if(n==0 || m==0) return 0;
//		if(m1.charAt(n-1)==m2.charAt(m-1)) {
//			dp[n][m]=1+getWays(n-1,m-1,m1,m2);
//			return dp[n][m];
//		}
//		
//		dp[n][m]= 0;
//		return dp[n][m];
//		
//	}
	static int getWaysTab(int n,int m,String m1,String m2,int[][] dp) {
		int max=-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
//				System.out.print(m1.charAt(i-1)+""+m2.charAt(j-1));
				if(m1.charAt(i-1)==m2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
//					System.out.print(i+""+j);
				}
				else dp[i][j]=0;
				max=Math.max(max, dp[i][j]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "abaacd";
		String m = "abadpax";
		System.out.print("BruteForce-->"+getWays(n.length(),m.length(),n,m,count));
//		int dp[][]=new int[n.length()+1][m.length()+1];
//		for(int temp[]:dp) {
//			Arrays.fill(temp, -1);
//		}
//		System.out.println("Memoize-->"+getWaysMemoize(n.length(),m.length(),n,m,dp));
		System.out.println("tabulation-->"+getWaysTab(n.length(),m.length(),n,m,new int[n.length()+1][m.length()+1]));

	}

}
