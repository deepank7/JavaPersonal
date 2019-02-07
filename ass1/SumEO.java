package ass1;

import java.util.Scanner;

public class SumEO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,sumeven=0,sumodd=0;
		while(n>0)
		{
			int rem=n%10;
			if(count%2==0)
			{
				sumeven=sumeven+rem;
			}
			else
			{
				sumodd=sumodd+rem;
			}
			n=n/10;
			count++;
		}
		System.out.println(sumeven);
		System.out.println(sumodd);
	}

}
