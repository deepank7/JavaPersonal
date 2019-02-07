package lec4;

import java.util.Scanner;

public class CalTheSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int ans[] = new int[n];
		for (int j = 0; j < q; j++) {
			int rot = sc.nextInt();
			for (int i = 0; i < n; i++) {
				if (i < rot) {
					ans[i] = a[i + (a.length - rot)];
				} else {
					ans[i] = a[i - rot];
				}
			}
			for (int i = 0; i < n; i++) {
				a[i] = a[i] + ans[i];
			}
		}
		int sum=0;
		for (int i = 0; i < n; i++) {
			a[i] = a[i]%(1000000000+7);
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
