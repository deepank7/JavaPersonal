package lec2;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 2*n-3;
		int val;
		while (row <= n) {
			int cst = 1;
			val=1;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				val++;
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				System.out.print("\t");
				csp++;
			}
			cst = 1;
			if(row==n)
			cst=2;	
			if(row==n)
				val=row-1;
			else
				val=row;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				val--;
				cst++;
			}
				nst++;
				nsp=nsp-2;
				row++;
				System.out.println();
		}
	}


	}

