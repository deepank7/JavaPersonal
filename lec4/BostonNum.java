package lec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class BostonNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SOE(n);
		if(isBoston(n)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

	static ArrayList<Integer> list = new ArrayList<>();
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
				list.add(i);
			}
		}

	}
	static boolean isBoston(int n) {
		int original_no = n;

		int pDigitSum = 0;
		for (int i = 0;	list.get(i)*list.get(i) <= n; i++) {
			while (n % list.get(i) == 0) {
				int p = list.get(i);
				n = n / p;
				while (p > 0) {
					pDigitSum += (p % 10);
					p = p / 10;
				}
			}
		}

		if (n != 1 && n != original_no) {
			while (n > 0) {
				pDigitSum = pDigitSum + n % 10;
				n = n / 10;
			}
		}

		int sumDigits = 0;
		while (original_no > 0) {
			sumDigits = sumDigits + original_no % 10;
			original_no = original_no / 10;
		}

		return (pDigitSum == sumDigits);
	}
}
