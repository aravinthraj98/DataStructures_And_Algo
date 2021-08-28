package Dp_Problems.Subsequence;


public class PrintLongestCommonSubseq{
	static String GetLongestCommon(String s1,String s2,int n,int m) {
		int dp[][]= new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
			}
		}
		return getString(dp,s1,s2,n,m);
		
	}
	static String getString(int[][] dp,String s1,String s2,int n,int m) {
		int i=n;int j=m;
		String res="";
		while(i>0 && j>0) {
			if(s1.charAt(i-1)==s2.charAt(j-1)) {
				res=s1.charAt(i-1)+res;
				i--;
				j--;
			}
			else {
				if(dp[i][j-1]>dp[i-1][j]) {
					j--;
				}
				else {
					i--;
				}
			}
		}
		return res;
	}
	public static void main(String args[]) {
		String s1="bca";
		String s2="bcabaca";
		String s =GetLongestCommon(s1,s2,s1.length(),s2.length());
		System.out.print(s);
	}
}