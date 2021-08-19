package BackTracking;

public class KnightsTour {

	final static int dx[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
	final static int dy[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
	
	public static void printKnightsTour(int x, int y, int chess[][], int move) {
		
		if (x < 0 || x >= chess.length || y < 0 || y >= chess[0].length || chess[x][y] > 0)
			return;

		if (move == chess.length * chess.length) {
			chess[x][y] = move;
			displayBoard(chess);
			chess[x][y] = 0;
			return;
		}

		chess[x][y] = move;
		for (int i = 0; i < 8; i++) {
			printKnightsTour(x + dx[i], y + dy[i], chess, move + 1);
		}
		chess[x][y] = 0;
	}

	private static void displayBoard(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++)
				System.out.print(mat[i][j] + "  ");
			System.out.println();
		}
		System.out.println("==================");
	}

	public static void main(String args[]) {

		int n = 5;
		int moves = 0;
		int[][] chess = new int[n][n];
		
		printKnightsTour(2, 3, chess, moves);		
	}
}