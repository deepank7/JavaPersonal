package lec3;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		series2(n1, n2);
	}

	/*public static void series(int n1, int n2) {
		int sum;
		for (int i = 1; i <= n1 + n2; i++) {
			sum = 0;
			sum = (3 * i) + 2;
			if ((sum % n2) != 0)
				System.out.println(sum);
		}
	}*/
	
public static void series2(int n1, int n2) {
		
		int i = 1;
		int cnt = 0;
		while(cnt < n1) {

			int sum = (3 * i) + 2;
			
			if ((sum % n2) != 0){
				System.out.println(sum);
			cnt++;
			}
				i++;
		}
	
	}
}
