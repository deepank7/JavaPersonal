package ass1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=1;
		int a=0;
		int b=1;
		while(row<=n)
		{
			int cst=1;
			int val=a+b;
			while(cst<=nst)
			{
				    if(row==1 && cst==1)
					{System.out.print(0);}
				    else if(row==2 && cst==1)
				    {System.out.print(1+" ");}	
				    else {
				    System.out.print(val+" ");
					a=b;
					b=val;
					val=a+b;}
				    cst++;
			}
			System.out.println();
			row++;
			nst++;
		}

	}

}
