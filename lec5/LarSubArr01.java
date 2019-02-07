package lec5;

import java.util.Scanner;

public class LarSubArr01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum1 = 0, sum2 = 0;
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			findSubArray(a, n);
			}
		}

	public static void findSubArray(int arr[], int n) {
		int sum = 0;
		int maxsize = -1, startindex = 0;
		int endindex = 0;

		// Pick a starting point as i

		for (int i = 0; i < n - 1; i++) {
			sum = (arr[i] == 0) ? -1 : 1;

			// Consider all subarrays starting from i

			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 0)
					sum += -1;
				else
					sum += 1;

				// If this is a 0 sum subarray, then
				// compare it with maximum size subarray
				// calculated so far

				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					startindex = i;
				}
			}
		}
		endindex = startindex + maxsize - 1;
		if (maxsize == -1)
			System.out.println("No such subarray");
		else
			System.out.println(startindex + " to " + endindex);

	}

}
