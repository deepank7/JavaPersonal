package lec6;

import java.util.Scanner;

public class ContainArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(ContainsEl(a, 0, m));
	}

	public static boolean ContainsEl(int[] a, int si, int element) {

		if (si == a.length - 1) {
			return true;
		}

		boolean res = ContainsEl(a, si + 1, element);
		if (a[si] == element) {
			return true;
		} else {
			return false;
		}
	}
}
