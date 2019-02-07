package lec5;

import java.util.Scanner;

public class FormBiggNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			bubbleSort(a);
			for (int i = 0; i < n; i++) {
				System.out.print(a[i]);
			}
		}
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int counter = 0; counter <= n - 1; counter++) {
			for (int j = 0; j < n - counter - 1; j++) {
				int n1 = arr[j];
				int n2 = arr[j + 1];
				String n1n2 = n1 + "" + n2;
				int nn1n2 = Integer.parseInt(n1n2);
				String n2n1 = n2 + "" + n1;
				int nn2n1 = Integer.parseInt(n2n1);
				if (nn1n2 < nn2n1) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
