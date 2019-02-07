package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
		int nr=2*n-1;
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
			if(row<=nr/2){
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
