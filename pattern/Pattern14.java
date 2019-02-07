package pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nr=2*n-1;
		int nst=n;
		int nsp=0;
		while(row<=nr)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<n){
				nst--;
				nsp=nsp+2;
			}else{
				nst++;
				nsp=nsp-2;
			}
			row++;
		}

	}

}
