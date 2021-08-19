package Dp;

import java.util.Arrays;

public class GridTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int grid[][] =new int[n+1][n+1];
		for(int i=0;i<grid.length;i++) {
			Arrays.fill(grid[i], 0);
		}
		grid[1][1]=1;
		for(int i=0;i<grid.length;i++) { 
			for(int j=0;j<grid[i].length;j++) {
				if(j+1<grid[i].length)grid[i][j+1]+=grid[i][j];
				if(i+1<grid.length)grid[i+1][j]+=grid[i][j];
			}
		}
		System.out.print(grid[n][n]);
		

	}

}
