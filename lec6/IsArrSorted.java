package lec6;

import java.util.Scanner;

public class IsArrSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(IsSorted(a, 0));
	}

	public static boolean IsSorted(int[] a, int si) {

		if (si == a.length - 1) {
			return true;
		}

		if (a[si] > a[si + 1]) {
			return false;
		} else {
			boolean res = IsSorted(a, si + 1);
			return res;
		}

	}

}
