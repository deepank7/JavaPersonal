package lec4;

import java.util.Scanner;

public class ArrayOps {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		takeinput();
	}

	public static int[] takeinput() {
		System.out.println("Size?");
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		display(a);
		return a;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// System.out.println(arr[i]);
		}
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
