package Dp_Problems.knapsnack;

import java.util.Arrays;

public class CountAtmost3Jump {
	static int countJumpRecursion(int n) {
		if(n==0)return 1;
		if(n<0)return 0;
		return countJumpRecursion(n-1)+countJumpRecursion(n-2)+countJumpRecursion(n-3);
	}
	static int GetCountTab(int n,int tab[]) {
		for(int i=0;i<tab.length;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j<=n) {
					tab[i+j]+=tab[i];
				}
			}
		}
		return tab[n];
		
	}
   public static void main(String args[]) {
	    int n=11;
	    int tab[] = new int[n+1];
	    Arrays.fill(tab, 0);
	    tab[0]=1;
	    int count =GetCountTab(n,tab);
	    System.out.print("count "+count);
	    System.out.print("\ncount jump recursion "+countJumpRecursion(n));
   }
}
