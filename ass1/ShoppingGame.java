package ass1;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			int t1=0;
			int t2=0;
			while(m>0 && n>0)
			{
				t1=t2+1;
				t2=t1+1;
				m=m-t1;
				if(m<0)
					break;
				n=n-t2;
				if(n<0)
					break;
			}
			if(m>n)
			{
				System.out.println("Aayush");
			}
			else
			{
				System.out.println("Harshit");
			}
			
		}

	}

}
