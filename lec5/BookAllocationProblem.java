package lec5;

import java.util.Scanner;

public class BookAllocationProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int sum=0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum+=a[i];
		}
		
	}

}
