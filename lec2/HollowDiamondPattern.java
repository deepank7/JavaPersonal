package lec2;

import java.util.Scanner;

public class HollowDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = n/2+1;
		int nsp = -1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*"+"\t");
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" "+"\t");
				csp++;
			}
			cst = 1;
			
			if(row ==1 || row == n)
				cst = 2;
			while (cst <= nst) {
				System.out.print("*"+"\t");
				cst++;
			}
			System.out.println();
			if (row <= n / 2) {
				nst--;
				nsp = nsp + 2;
			} else {
				nst++;
				nsp = nsp - 2;
			}
			row++;
		}
	}
}
