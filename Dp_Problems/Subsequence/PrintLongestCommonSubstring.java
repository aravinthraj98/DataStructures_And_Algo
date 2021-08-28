package Dp_Problems.Subsequence;





import java.util.Arrays;

public class PrintLongestCommonSubstring {
//	static int getWays(int n,int m,String m1 ,String m2) {
//		if(n==0 || m==0) return 0;
//		if(m1.charAt(n-1)==m2.charAt(m-1))return 1+getWays(n-1,m-1,m1,m2);
//		
//		return Math.max(getWays(n,m-1,m1,m2), getWays(n-1,m,m1,m2));
//	}
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
	static void print(String m2,int temp,int max) {
		int startIndex =temp-max+1;
		System.out.print(m2.substring(startIndex,temp+1)+"\n");
		
	}
	
	static int getWaysTab(int n,int m,String m1,String m2,int[][] dp) {
		int max=-1;
		int temp=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
//				System.out.print(m1.charAt(i-1)+""+m2.charAt(j-1));
				if(m1.charAt(i-1)==m2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
//					System.out.print(i+""+j);
				}
				else dp[i][j]=0;
				if(dp[i][j]>max) {
					max=dp[i][j];
					temp=j-1;
				}
//				max=Math.max(max, dp[i][j]);
				
			}
		}
		print(m2,temp,max);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String n = "abacd";
//		String m = "abdpax";
		String n="level";
		String m="goodeveningleve";
//		System.out.print("BruteForce-->"+getWays(n.length(),m.length(),n,m));
//		int dp[][]=new int[n.length()+1][m.length()+1];
//		for(int temp[]:dp) {
//			Arrays.fill(temp, -1);
//		}
//		System.out.println("Memoize-->"+getWaysMemoize(n.length(),m.length(),n,m,dp));
		System.out.println("tabulation-->"+getWaysTab(n.length(),m.length(),n,m,new int[n.length()+1][m.length()+1]));

	}

}

