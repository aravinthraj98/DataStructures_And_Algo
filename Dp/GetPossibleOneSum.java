package Dp;

import java.util.Arrays;

public class GetPossibleOneSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetSum=5;
		int nums[]= {1,2,3,4,5};
		String[] tab = new String[targetSum+1];
		Arrays.fill(tab, null);
		tab[0]="";
		for(int i=0;i<targetSum;i++) {
			if(tab[i]!=null) {
				for(int j=0;j<nums.length;j++) {
					if(i+nums[j]<=targetSum) {
						
						tab[i+nums[j]]=tab[i]+","+nums[j];
						if(i+nums[j]==targetSum)System.out.println("here"+tab[i+nums[j]]);
					}
				}
			}
		}
		System.out.print("Possibility"+tab[targetSum]);

	}

}
