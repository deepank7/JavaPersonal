package lec6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(triangle(str));
	}

	public static int sum = 0;

	public static String triangle(String str) {

		int n = Integer.parseInt(str);
		if (n == 0) {
			sum = sum + n;
			return Integer.toString(n);
		}
		int rem = n % 10;
		sum = sum + rem;
		triangle(Integer.toString(n / 10));
		return Integer.toString(sum);
	}

}
