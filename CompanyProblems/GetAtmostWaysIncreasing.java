package CompanyProblems;

import java.util.HashSet;

//there will be a range of numbers,Then 
//we have to count atmostk posibilities in increasing order of numbers
//eg k=2 range 8 and 9 possibilities 8,9,88,99,89 //5ways
public class GetAtmostWaysIncreasing {
	static HashSet<String> set = new HashSet<>();
	static int getCount(int k,int count,String s,int i) {
		int t=0;
		
//		StringBuilder temp = new StringBuilder(s);
		if(count<i) {
			return 0;
		}
		
		if(k==0) {
			System.out.println(s);
			set.add(s);
			t++;
			return t;
		}

		if(k>0 && s.length()>0) {
			set.add(s);
			System.out.println(s);
			t++;
		}
		
		
		
		t+=getCount(k-1,count,s+i,i);
		t+=getCount(k,count,s,i+1);
		return t;
	}
   static int getCountDp(int k,int count) {
	   int dp[][] = new int[count+1][k+1];
	   for(int i=1;i<=count;i++) {
		   for(int j=1;j<=k;j++) {
			   dp[i][j]+=1+dp[i-1][j]+dp[i][j-1];
		   }
	   }
	   return dp[count][k];
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int m=8;//range
		int n=10;//range
		int count =n-m+1;
		getCount(k,count,"",1);
		System.out.println(getCountDp(k,count));
		System.out.print(set.size());
		
		
		

	}

}
