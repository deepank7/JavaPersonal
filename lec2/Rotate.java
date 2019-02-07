package lec2;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int nod = 0;
		int a = n;
		while (a != 0) {
			a = a / 10;
			nod++;
		}
		r = r % nod;
		if (r < 0) {
			r = r + nod;
		}
		int div = (int) Math.pow(10, r);
		int mul = (int) Math.pow(10, nod - r);

		int rem = n % div;
		int quo = n / div;

		int ans = rem * mul + quo;
		System.out.println(ans);
	}
}
