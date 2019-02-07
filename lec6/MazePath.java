package lec6;

import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int er = sc.nextInt();
		int ec = sc.nextInt();
		counte(1, 1, er, ec, "");
		System.out.println(count);
		mazePath(1, 1, er, ec, "");

	}

	static int count = 0;

	public static void mazePath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans);
			System.out.print(" ");
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		mazePath(cr + 1, cc, er, ec, ans + "V");
		mazePath(cr, cc + 1, er, ec, ans + "H");
		mazePath(cr + 1, cc + 1, er, ec, ans + "D");
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
