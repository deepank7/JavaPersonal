package pattern;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int row = 1;

		int nst = 1;
		int nsp = n-1;

		while (row <= n) {
			// work for spaces
			
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				System.out.print("\t");
				csp = csp + 1;
			}

			int cst = 1;
			int val=row;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				if(cst<=nst/2) {
					val++;
				}else {
					val--;
				}
				cst = cst + 1;
			}

			// prep
				nst = nst + 2;
				nsp = nsp - 1;
			    row = row + 1;
			System.out.println();

	}


	}

}
