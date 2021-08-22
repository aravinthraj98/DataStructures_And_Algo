package Dp;

import java.util.Arrays;

public class BestSumTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetSum=5;
		int nums[]= {1,2,4,1};
		String[] tab = new String[targetSum+1];
		Arrays.fill(tab, null);
		tab[0]="";
		int count =0;
		for(int i=0;i<targetSum;i++) {
			if(tab[i]!=null) {
				for(int j=0;j<nums.length;j++) {
					
					if(i+nums[j]<=targetSum) {
					
						if(tab[i+nums[j]]==null)
						tab[i+nums[j]]=tab[i]+","+nums[j];
						else {
							if(tab[i+nums[j]].length()>(tab[i]+","+nums[j]).length()) {
								tab[i+nums[j]]=tab[i]+","+nums[j];
							}
						}
					
						
					}
				}
			}
		}
		System.out.print("Possibility"+tab[targetSum]+"\ncount"+count);

	}

}
