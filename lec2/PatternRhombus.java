package lec2;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;

		int nst = 1;
		int nsp = n / 2;

		while (row <= n) {
			// work for spaces

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" "+"\t");
				csp = csp + 1;
			}

			int cst = 1;

			int val = 0;
			if (row <= n / 2) {
				val = row;

			} else {
				val = n - row + 1;
			}
			while (cst <= nst) {
				System.out.print(val+"\t");
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}
				cst = cst + 1;
			}

			// prep

			if (row <= n / 2) {
				nst = nst + 2;
				nsp = nsp - 1;
			} else {
				nst = nst - 2;
				nsp = nsp + 1;
			}
			row = row + 1;
			System.out.println();

		}

	}

}
