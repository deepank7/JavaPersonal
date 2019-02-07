package lec4;

import java.util.Scanner;

public class PainterProb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nop = sc.nextInt();
		int nob = sc.nextInt();
		int[] a = new int[nob];
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
			if (isPossible(a, nob, nop, mid)) {
				hi = mid - 1;
				Fa = mid;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(Fa);
	}

	public static boolean isPossible(int[] arr, int nob, int nop, int mid) {
		int painter = 1;
		int timeRemaining = mid;
		// i keeps a track of number of boards painted
		int i = 0;
		while (i < arr.length) {
			if (arr[i] <= timeRemaining) {
				timeRemaining = timeRemaining - arr[i];
				i++;
			} else {
				painter++;
				timeRemaining = mid;
				if (painter > nop) {
					return false;
				}
			}
		}
		return true;
	}

}
