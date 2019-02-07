package lec7;

import java.util.Scanner;

public class LexoOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		lexicoCount(0, n);
	}

	public static void lexicoCount(int curr, int end) {

		if (curr > end) {
			return;
		}
		System.out.print(curr + " ");
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			lexicoCount(curr * 10 + i, end);
		}
	}
}
