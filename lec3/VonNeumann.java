package lec3;

import java.util.Scanner;

public class VonNeumann {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int bn=sc.nextInt();
			int dec=0;
		    int mul=1;
		      while(bn!=0)
		        {
		            int rem=bn%10;
		            dec=dec+rem*mul;
		            bn=bn/10;
		            mul=mul*2;
		        }
		        System.out.println(dec);
		}
	}

}
