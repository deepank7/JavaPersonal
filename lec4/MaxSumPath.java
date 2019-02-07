package lec4;

import java.util.Scanner;

public class MaxSumPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int l = 0; l < t; l++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for (int k = 0; k < n; k++) {
				a[k] = sc.nextInt();
			}
			for (int k = 0; k < m; k++) {
				b[k] = sc.nextInt();
			}
			int i = 0, j = 0, sum1 = 0, sum2 = 0, fs = 0;
			while (i < n && j < m) {
				if (a[i] < b[j]) {
					sum1 += a[i];
					i++;
				} else if (a[i] > b[j]) {
					sum2 += b[j];
					j++;
				} else {
					sum1 += a[i];
					sum2 += b[j];
					fs += Math.max(sum1, sum2);
					sum1 = 0;
					sum2 = 0;
					i++;
					j++;
				}
			}
			while (i < a.length) {
				sum1 += a[i];
				i++;
			}
			while (j < b.length) {
				sum2 += a[j];
				j++;
			}
			fs += Math.max(sum1, sum2);
			System.out.println(fs);
		}
	}

}
