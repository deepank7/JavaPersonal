package lec2;

import java.util.Scanner;

public class PatternHourglas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nr = 2 * n + 1;
		int nst = 2 * n + 1;
		int nsp = 0;
		int val;
		while (row <= nr) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" "+" ");
				csp++;
			}
			int cst = 1;
			if(row<=n)
				val=n-row+1;
			else
				val=row-n-1;
			while (cst <= nst) {
				System.out.print(val+" ");
				if(cst<=nst/2)
					val--;
				else
					val++;
				cst++;
			}
			System.out.println();
			if (row <= nr / 2) {
				nst=nst-2;
				nsp++;
			} else {
				nst=nst+2;
				nsp--;
			}
			row++;
		}
	}

}
