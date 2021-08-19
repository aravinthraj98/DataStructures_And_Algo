package BinarySearchPractice;

public class MatrixSearch {
	static void Search(int mat[][],int x) {
		int i=0;
		int j=mat[0].length-1;
		while(i<mat.length && j<mat[0].length) {
			if(mat[i][j]>x) {
				j--;
			}
			else if(mat[i][j]==x) {
				System.out.print(i+","+j);
				return;
			}
			else {
				i++;
			}
		}
		System.out.print("not fount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 29;
		int mat[][] = { {10, 20, 30, 40},
		                {15, 25, 35, 45},
		                {27, 29, 37, 48},
		                {32, 33, 39, 50}};
		Search(mat,x);
	}

}
