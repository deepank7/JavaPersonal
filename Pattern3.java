import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		int nsp=n-2;
		int row=1;
		while(row<=n)
		{
			//spaces
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp+=1;
			}
			//star
			int count=1;
			while(count<=nst) 
			{
				System.out.print("* ");
				count += 1;
			}
			System.out.println();
			row=row+1;
			nst=nst+2;
			nsp=nsp-1;
		}
	}

}
