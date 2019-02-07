package lec2;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int inv = 0;
		int place = 1;
		while (n != 0) {
			int rem = n % 10;
			inv = inv + place * (int) Math.pow(10, rem - 1);
			n = n / 10;
			place++;
		}
		System.out.println(inv);
	}
}
