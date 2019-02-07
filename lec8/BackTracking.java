package lec8;

public class BackTracking {

	public static void main(String[] args) {
		boolean[][] visited = new boolean[4][4];
		// int[][] board = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1,
		// 0 } };
		// NQueen(board, 0,"");
		// BlockedMaze(board, 0, 0, "", visited);

	}

	public static void NQueen(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isItSafe(board, row, col) == true) {
				board[row][col] = true;
				NQueen(board, row + 1, ans + row + "-" + col + " ");
				board[row][col] = false;
			}
		}

	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {
		// vertical
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
		}

		// diag right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}

		// diag left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		return true;
	}

	public static void BlockedMaze(int[][] board, int row, int col, String ans, boolean[][] visited) {

		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col]
				|| board[row][col] == 1) {
			return;
		}
		visited[row][col] = true;
		BlockedMaze(board, row + 1, col, ans + "B", visited);
		BlockedMaze(board, row, col + 1, ans + "R", visited);
		BlockedMaze(board, row - 1, col, ans + "T", visited);
		BlockedMaze(board, row, col - 1, ans + "L", visited);
		visited[row][col] = false;
	}

}
