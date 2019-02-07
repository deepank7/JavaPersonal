package lec4;

import java.util.Scanner;

public class AlexGoesShopp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for (int j = 0; j < q; j++) {
			int A = sc.nextInt();
			int K = sc.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) {

				if (A%a[i]==0) {
					count++;

				}
			}
			if (count >= K)
				System.out.println("Yes");
			else
				System.out.println("No");

		}

	}

}
