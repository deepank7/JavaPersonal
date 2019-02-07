package pattern;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nr = 2 * n - 1;
		int nst = 1;
		while (row <= nr) {
			int cst = 1;
			while (cst <= nst) {
				
				int val;
				if(row<=n)
					val=row;
				else
					val=nr-row+1;
				if (cst % 2 == 0) {
					System.out.print("*");
				}else {
						{System.out.print(val);}
				}
				cst++;
			}
			System.out.println();
			if (row <= nr / 2) {
				nst = nst + 2;
			} else {
				nst = nst - 2;
			}
			row++;
		}
	}
}
