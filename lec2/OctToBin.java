package lec2;

import java.util.Scanner;

public class OctToBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int dec=0;
	    int mul=1;
	      while(n!=0)
	        {
	            int rem=n%10;
	            dec=dec+rem*mul;
	            n=n/10;
	            mul=mul*8;
	        }
	      	int ans=0;
			int mull=1;
			while(dec>0)
			{
				int rem=dec%2;
				ans=ans+(rem*mull);
				dec=dec/2;
				mull=mull*10;
			}
			System.out.println(ans);
	        
	}

}
