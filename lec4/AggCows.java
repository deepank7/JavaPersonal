package lec4;

import java.util.Arrays;
import java.util.Scanner;

public class AggCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] a = new int[nos];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int lo = 0;

		int hi = a[a.length - 1] - a[0];
		int fa = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isPoss(a, nos, noc, mid)) {
				lo = mid + 1;
				fa = mid;
			} else {
				hi = mid - 1;
			}

		}
		System.out.println(fa);

	}

	public static boolean isPoss(int[] arr, int nos, int noc, int mid) {
		int cowpl = 1;
		int pos = arr[0];
		for (int i = 1; i < nos; i++) {
			if (arr[i] - pos >= mid) {

				cowpl++;

				pos = arr[i];

				if (cowpl == noc) {

					return true;

				}

			}
		}
		return false;
	}
}
