package Dp;

public class TargetSumTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetSum=8;
		int nums[]= {3,7,9};
		boolean[] tab = new boolean[targetSum+1];
		tab[0]=true;
		for(int i=0;i<targetSum;i++) {
			if(tab[i]==true) {
				for(int j=0;j<nums.length;j++) {
					if(i+nums[j]<=targetSum)tab[i+nums[j]]=true;
				}
			}
		}
		System.out.print("Possibility"+tab[targetSum]);

	}

}
