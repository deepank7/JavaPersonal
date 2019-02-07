import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int mul=1;
		while(n>0)
		{
			int rem=n%2;
			ans=ans+(rem*mul);
			n=n/2;
			mul=mul*10;
		}
		System.out.println(ans);

	}

}
