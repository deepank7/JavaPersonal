import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		int rem = 0, rev = 0;
		while (x > 0) 
		{
			rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;
		}
		System.out.println(rev);
	}

}
