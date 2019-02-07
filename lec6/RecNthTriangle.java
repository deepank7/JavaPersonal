package lec6;

import java.util.Scanner;

public class RecNthTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(triangle(n));

	}

	public static int triangle(int n) {
		if (n == 1) {
			return 1;
		}

		int fun = triangle(n - 1);
		int fn = n + fun;

		return fn;
	}
}