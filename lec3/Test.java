package lec3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;

		int nst = 1;
		int nsp = n - 1;
		int nr = 2 * n - 1;
		while (row <= nr) {
			// work for spaces

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" " + "\t");
				csp = csp + 1;
			}
			int cst = 1;
			
			int val = 0;
			if (row <= n) {
				val = row;
			} else {
				val = nr - row + 1;
			}
			while (cst <= nst) {
				System.out.print(val + "\t");
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}
				cst = cst + 1;
			}
			// prep
			if (row <= nr/2) {
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
