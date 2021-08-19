package Dp;

import java.util.Arrays;

public class GridTraveller {
	static int getPathCount(int m,int n,int[][] grid) {
		if(m<0 || n<0) return 0;
		if(grid[m][n]!=-1) return grid[m][n];
		if(m==0 && n==0)return 1;
		
		
		
		grid[m][n]=getPathCount(m-1,n,grid)+getPathCount(m,n-1,grid);
		
		return grid[m][n];
	}
   public static void main(String args[]) {
	   int m=3;
	   int n=3    ;
	   int grid[][]=new int[m][n];
	   for(int i=0;i<m;i++) {
		   Arrays.fill(grid[i], -1);
	   }
	   System.out.print(getPathCount(m-1,n-1,grid));
   }
}
