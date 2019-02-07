package lec6;

import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		counte(0, n, m, "");
		System.out.println(count);
		boardPath(0, n, m, "");
	}

	public static int count = 0;

	public static void boardPath(int curr, int end, int dice, String ans) {

		if (curr == end) {
			System.out.print(ans);
			System.out.print(" ");
			return;
		}

		if (curr > end) {
			return;
		}

		for (int i = 1; i <= dice; i++) {
			boardPath(curr + i, end, dice, ans + i);
		}
	}

	public static void counte(int curr, int end, int dice, String ans) {

		if (curr == end) {
			count++;
			return;
		}

		if (curr > end) {
			return;
		}

		for (int i = 1; i <= dice; i++) {
			counte(curr + i, end, dice, ans + i);
		}
	}

}
