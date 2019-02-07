package lec6;

import java.util.Scanner;

public class RevArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		reverse(a, 0, a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void reverse(int[] a, int i, int j) {

		if (i < j) {

			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			reverse(a, ++i, --j);
		}
	}
}
