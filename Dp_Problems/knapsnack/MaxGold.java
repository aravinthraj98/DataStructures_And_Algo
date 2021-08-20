package Dp_Problems.knapsnack;

public class MaxGold {
    static int GetMaxGold(int[][] stepGrid,int [][] grid) {
    	stepGrid[0][0]=grid[0][0];
    	for(int i=1;i<grid[0].length;i++) {
    	   grid[0][i]+=grid[0][i-1];
    	}
    	for(int i=1;i<grid.length;i++) {
    		for(int j=0;j<grid[0].length;j++) {
    		     if(j==0)grid[i][j]+=grid[i-1][j];
    		     else grid[i][j]+=Math.max(grid[i-1][j], grid[i][j-1]);
    		}
    	}
    	return grid[grid.length-1][grid[0].length-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { {1, 3, 1, 5},
	            {2, 2, 4, 1},
	            {5, 0, 2, 3},
	            {0, 6, 1, 2}};
		int stepGrid[][]= new int[grid.length][grid[0].length];
		int max =GetMaxGold(stepGrid,grid);
		System.out.print("Max"+max);

	}

}
