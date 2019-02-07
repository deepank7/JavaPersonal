package lec3;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a[]=new int[200];
		for(int i=1;i<200;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			if(sum>=0)
				{System.out.println(a[i]);}
			else
				{break;}
		}
	
	}

}
