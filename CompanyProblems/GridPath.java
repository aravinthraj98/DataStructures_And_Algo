package CompanyProblems;

public class GridPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int grid[][]= {{3,1},{1,3},{3,3}};
		int grid[][]= {{5,7},{6,5}};
		int ans[]=new int[grid[0].length];
		int max=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(ans[j]==-1)continue;
				if(i>0 && grid[i][j]>grid[i-1][j]) {
					ans[j]+=grid[i][j];
				}
				else {
					if(i==0)
					ans[j]=grid[i][j];
					else {
						ans[j]=-1;
					}
				}
				max=max>ans[j]?max:ans[j];
			}
			
		}
		System.out.print(max);

	}

}


//Grid Path
//Given a grid. Each cell of the grid contains a single integer value. These values are described by 2D
//integer array a with N rows and 2 columns, where a[i][j] is the value in the cell located in row i,
//column j.
//Standing in (i; j), the player can move to any cell of the next row (i+1; j2) under the condition that
//a[i+1][j2] > a[i][j]. In other words, the value in the next cell of the player's path should be strictly
//greater than the value in the current cell of the player's path.
//The player can't make any moves if he's already in the last row.
//If the player starts in any cell of the first row (either (1; 1) or (1; 2)), what is the maximum possible
//total sum of values in all cells he can visit on his path?
//Print the answer modulo 10^9+7.
//Input:
//The first line contains an integer, n, denoting the number of rows in a.
//The next line contains an integer, 2, denoting the number of columns in a.
//Each line i of the n subsequent lines (where 0 ≤ i < n) contains 2 space separated integers each
//describing the row a[i]. 
