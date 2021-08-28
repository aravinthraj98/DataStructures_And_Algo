package CompanyProblems;

import java.util.HashMap;

public class JogOrWalk {
	static int getWays(int n) {
		if(n==0)return 1;
		if(n<0)return 0;
		return getWays(n-1)+getWays(n-2);
				
	}
	static int GetWaysMemoise(int n,HashMap<Integer,Integer> h) {
		if(h.get(n)!=null)return h.get(n);
		if(n==0)return 1;
		if(n<0)return 0;
		int count =getWays(n-1)+getWays(n-2);
		h.put(n, count);
		return count;
		
		
	}
	static int GetWaysTab(int n) {
		int dp[]=new int[n+1];
		dp[0]=1;//1 0 0 0 0 0 
		for(int i=0;i<=n;i++) {
			if(dp[i]!=0) {
				if(i+1<=n) {
					dp[i+1]+=dp[i];
				}
				if(i+2<=n) {
					dp[i+2]+=dp[i];
				}
			}
		}
		return dp[n];
	}
	static void getFactorial(int []fact) {
		int temp=1;
		for(int i=1;i<fact.length;i++) {
			fact[i]=temp*i;
			temp=fact[i];
		}
	}
	static int getPermutation(int n) {
	    int[] fact = new int[n+1];
	    fact[0]=1;
	    getFactorial(fact);
	    int possible =n/2;
	    int sum=0;
	    int temp=n;
	    for(int i=0;i<=possible;i++) {
	    	if(i==0) {
	    		sum+=1;
	    		continue;
	    	}
	    	else {
//	    		temp=n-i;
	    		temp=i+(n-(2*i));
	    	}
	    	System.out.println(i+" "+fact[temp]+" "+fact[temp-i]+" "+fact[i]);
	    	sum+=fact[temp]/(fact[i]*fact[temp-i]);
//	    	sum+=fact[temp]/(fact[temp-i]*fact[i]);
	    }
	    return sum;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=8;//11111,1211,1121,1112,2111,221,122,212
//    System.out.println(getWays(n));
    System.out.println(GetWaysMemoise(n,new HashMap<Integer,Integer>()));
    System.out.println(GetWaysTab(n));
    System.out.print("getPermutation"+getPermutation(n));
    
	}

}
