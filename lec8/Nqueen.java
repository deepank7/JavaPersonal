package lec8;

import java.util.Scanner;

public class Nqueen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[][] board=new boolean[n][n];
		NQueen(board, 0, "");
	}
	public static void NQueen(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.print(ans);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isItSafe(board, row, col) == true) {
				board[row][col] = true;
				NQueen(board, row + 1, ans +"{"+ row + "-" + col + "}"+" ");
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


}
