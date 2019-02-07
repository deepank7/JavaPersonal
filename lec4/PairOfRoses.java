package lec4;

import java.util.Scanner;

public class PairOfRoses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			int m = sc.nextInt();
			int max = Integer.MAX_VALUE;
			int start = 0;
			int end = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if ((a[i] + a[j]) == m) {
						if (Math.abs(a[i] - a[j]) < max) {
							start = a[i];
							end = a[j];
							max = Math.abs(end - start);

						}
					}
				}
			}

			if (start < end)
				System.out.println("Deepak should buy roses whose prices are "+start + " and " + end);
			else
				System.out.println("Deepak should buy roses whose prices are "+end + " and " + start);

		}
	}

}
