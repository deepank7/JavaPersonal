package lec9;

import java.util.Arrays;
import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int x = sc.nextInt();
		// int n = sc.nextInt();
		// System.out.println(poly(x, n));
		// System.out.println(palindromeCount("nitin"));
		// SOE(25);
		pow(3, 5);
	}

	public static int poly(int x, int n) {
		int mul = x;
		int sum = 0;
		for (int coeff = n; coeff >= 1; coeff--) {
			sum = sum + (coeff * mul);
			mul = mul * x;
		}
		return sum;
	}

	public static int palindromeCount(String str) {
		// odd
		int count = 0;
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}

		// even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}

	public static void SOE(int n) {

		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (primes[table] == false) {
				continue;
			}
			for (int mul = 2; table * mul <= n; mul++) {
				primes[table * mul] = false;
			}
		}
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}

	}

	public static void pow(int x, int n) {
		int mul = x;
		while (n > 0) {
			if (n % 2 == 0) {
				x = x * mul;
				n = n / 2;
			} else {
				x = x * mul;
				n = n - (n / 2);

				if (n == 1) {
					break;
				}
			}
		}
		System.out.println(x);
	}
}
