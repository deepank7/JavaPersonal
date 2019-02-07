package lec4;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++) {
		int nb = sc.nextInt();
		int ns = sc.nextInt();
		int[] a = new int[nb];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		int lo = 0;
		int hi = sum;
		int Fa = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isPossible(a, nb, ns, mid)) {
				hi = mid - 1;
				Fa = mid;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(Fa);
		}
	}

	public static boolean isPossible(int[] arr, int nob, int nos, int mid) {
		int stu = 1;
		int pr = 0;
		for (int i = 0; i < nob;) {
			if (pr + arr[i] <= mid) {
				pr = pr + arr[i];
				i++;
			} else {
				stu++;
				pr = 0;
				if (stu > nos) {
					return false;
				}
			}
		}
		return true;
	}

}
