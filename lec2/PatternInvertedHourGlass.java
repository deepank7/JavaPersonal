package lec2;

import java.util.Scanner;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nr = 2 * n + 1;
		int nst = 2;
		int nsp = 2 * n - 1;
		int val;
		while (row <= nr) {
			int cst = 1;
			val=n;
			while (cst <= nst-1) {
				System.out.print(val+" ");
					val--;
					cst++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" "+" ");
				csp++;
			}
			cst = 1;
			if(row<=n)
			{	val=n-row+1;}
			else if(row==n+1)
			{	val=1;		}
			else
			{	val=row-n-1;}
			if(row==n+1)
			{while (cst <= nst-2) {
				System.out.print(val+" ");
				val++;
				cst++;
			}}else {
			while (cst <= nst-1) {
				System.out.print(val+" ");
				val++;
				cst++;
			}}
			System.out.println();
			if (row <= nr / 2) {
				nst = nst + 1;
				nsp = nsp - 2;
			} else {
				nst = nst - 1;
				nsp = nsp + 2;
			}
			row++;
		}

	}

}
