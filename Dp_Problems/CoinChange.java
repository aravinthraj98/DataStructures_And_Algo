package Dp_Problems;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=15;
		int [] coins = {2,3,5,10};
		int Tab[] = new int[W+1];
		Tab[0]=1;
		for(int i=0;i<coins.length;i++) {
			for(int j=1;j<Tab.length;j++) {
				  if(coins[i]>j)continue;
				  Tab[j]+=Tab[j-coins[i]];
			}
		}
	
		System.out.print(Tab[W]);

	}

}
