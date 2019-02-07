import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int dec=0;
	    int mul=1;
	      while(n!=0)
	        {
	            int rem=n%10;
	            dec=dec+rem*mul;
	            n=n/10;
	            mul=mul*2;
	        }
	        System.out.println(dec);
	}

}
