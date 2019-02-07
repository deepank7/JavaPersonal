package lec4;

import java.util.Scanner;

public class NextSmallNextGreat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int f = 0; f < t; f++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				int index = -1;
				int val = -1;
				// next greater

				for (int j = i + 1; j < n; j++) {
					if (a[j] > a[i]) {
						index = j;
						break;
					}
				}

				if (index != -1) {
					// next smaller
					for (int k = index + 1; k < n; k++) {

						if (a[k] < a[index]) {
							val = k;
							break;
						}
					}
				}
				if (index != -1 && val != -1) {
					System.out.print(a[val]);
					System.out.print(" ");
				} else {
					System.out.print(val);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
