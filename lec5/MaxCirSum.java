package lec5;

import java.util.Scanner;

public class MaxCirSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int[] b = new int[2 * n];
			for (int i = 0; i < n; i++) {
				b[i] = a[i];
			}
			for (int i = n; i < 2 * n; i++) {
				b[i] = a[i - n];
			}
			int sum;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < a.length; i++) {

				sum = 0;

				for (int j = i; j < i + n; j++) {
					sum += b[j];
					if (sum > max) {
						max = sum;
					}
				}
			}
			System.out.println(max);
		}
	}

}
