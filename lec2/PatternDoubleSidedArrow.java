package lec2;

import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int nsp2 = 1;
		int val;
		while (row <= n) {
			// work for spaces

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" "+" ");
				csp = csp + 1;
			}

			int cst = 1;
			
			if(row<n/2+1)
			{val=row;
			while (cst <= nst) {
				System.out.print(val+" ");
				cst = cst + 1;
				val--;
			}}else {
				val=n-row+1; 
				while (cst <= nst) { 
				System.out.print(val+" ");
				cst = cst + 1;
				val--;
				}}
			
			if (row == 2 || row == n-1)
				{csp=2;}
			else	
				{csp = 1;}
			while (csp <= nsp2) {
				System.out.print(" "+" ");
				csp = csp + 2;
			}
			if (row == 1 || row == n)
				cst = 2;
			else
				cst = 1;
			val=1;
			while (cst <= nst) {
				System.out.print(val+" ");
				cst = cst + 1;
				val++;
			}
			// prep
			if (row <= n / 2) {
				nst = nst + 1;
				nsp = nsp - 2;
				nsp2 = nsp2 + 2;
			} else {
				nst = nst - 1;
				nsp = nsp + 2;
				nsp2 = nsp2 - 2;
			}
			row = row + 1;
			System.out.println();

		}

	}

}
