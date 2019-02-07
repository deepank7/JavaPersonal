package ass1;

import java.util.Scanner;

public class PatternWithZeroes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int nst=1;
		 int nsp=n-1;
		 int val=1;
		 int row=1;
		 while(row<=n)
		 {
			 //spaces
			 for(int csp=1;csp<=nsp;csp++)
			 {
				 System.out.print(" ");
			 }
			 //stars
			 for(int cst=1;cst<=nst;cst++)
			 {
				 System.out.print(val);
				 if(cst>1 && cst<nst)
				 {
					 val=0;
				 }
			 }
			 System.out.println();
			 nst=nst+2;
			 nsp=nsp-1;
			 row++;
			 val++;
		 }


	}

}
