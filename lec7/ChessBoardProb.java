package lec7;

import java.util.Scanner;

public class ChessBoardProb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int er = sc.nextInt();
		//counte(0, 0, er, er, "");
		//System.out.println(count);
		chessPath(0, 0, er-1, er-1, "");
	}

	static int count = 0;

	public static void chessPath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}
		for (int jump = 1; jump <= er; jump++) {
			chessPath(cr + jump, cc + jump, er, ec, ans +"{"+cr+"-"+cc+"}"+"B"+"{"+cr+jump+"-"+cc+jump+"}");
		}
			chessPath(cr+1, cc+2, er, ec, ans);
		
//		mazePath(cr + 1, cc, er, ec, ans + "V");
//		mazePath(cr, cc + 1, er, ec, ans + "H");
	}

	public static void counte(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			count++;
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		counte(cr + 1, cc, er, ec, ans + "V");
		counte(cr, cc + 1, er, ec, ans + "H");
		counte(cr + 1, cc + 1, er, ec, ans + "D");
	}

}
