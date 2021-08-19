package BackTracking;

public class Suduko {
	static void getPossibility(int[][] grid,int r,int c) {
		if(r==grid.length) {
			System.out.print("solved");
			return;
		}
		int _r=0;
		int _c=0;
		
		if(c==grid.length-1) {
			_r=r+1;_c=0;
		}
		else {
			_r=r;_c=c+1;
		}
		if(grid[r][c]!=0) {
			getPossibility(grid,_r,_c);
			return;
		}
		for(int val=1;val<=9;val++) {
			if(isPossible(grid,r,c,val)) {
				grid[r][c]=val;
				getPossibility(grid,_r,_c);
				grid[r][c]=0;
			}
		}
	
		
	}
	static boolean isPossible(int[][] grid,int row,int col,int val) {
		for(int i=0;i<grid[row].length;i++) {
			if(grid[row][i]==val || grid[i][col]==val) return false;
		}
		int subi=row/3*3;
		int subj=col/3*3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(grid[subi+i][subj+j]==val)return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
				{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 1, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
				{ 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

	

	
	getPossibility(grid,0,0);
	}
}
