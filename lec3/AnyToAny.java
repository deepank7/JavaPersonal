package lec3;

import java.util.Scanner;

public class AnyToAny {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int src=sc.nextInt();
	    int des = sc.nextInt();
	    int n=sc.nextInt();
	    int dec=0;
	    int mul=1;
	      while(n!=0)
	        {
	            int rem=n%10;
	            dec=dec+rem*mul;
	            n=n/10;
	            mul=mul*src;
	        }
			int ans = 0;
			int mul1 = 1;
			while (dec > 0) {
				int rem = dec % des;
				ans = ans + (rem * mul1);
				dec = dec / des;
				mul1 = mul1 * 10;
			}
			System.out.println(ans);

	}

}
