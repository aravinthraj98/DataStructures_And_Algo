package Dp_Problems.coinChange;

import java.util.Arrays;

public class CoinChange {
	static int getCountRec(int coins[],int[] Tab,int W,int i) {//Tab array doesn't need in argument
		if(W==0) {
			
			return 1;
		}
		if(i>=coins.length || coins[i]==0) return 0;
		
		if(W<0) return 0;
		return getCountRec(coins,Tab,W-coins[i],i)+getCountRec(coins,Tab,W,i+1);
	}

	
	static void getCountTab(int[] coins,int[] Tab,int W) {
		for(int i=0;i<coins.length;i++) {
			for(int j=1;j<Tab.length;j++) {
				  if(coins[i]>j)continue;
				  Tab[j]+=Tab[j-coins[i]];
			}
		}
	
		System.out.print("Tabulation  " +Tab[W]);

	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=8;
		int [] coins = {1,2,3};//111,12,3
		int Tab[] = new int[W+1];
		Tab[0]=1;
		getCountTab(coins,Tab,W);
		System.out.println("\nRecursion "+getCountRec(coins,Tab,W,0));
		
		
		
		
}
}
