package lec3;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		while (ch != 'x' && ch != 'X') {

			ch = sc.next().charAt(0);
			switch (ch) {

			case '*':
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				System.out.println(n1 * n2);
				break;
			case '/':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 / n2);
				break;
			case '+':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 + n2);
				break;
			case '-':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 - n2);
				break;
			case '%':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 % n2);
				break;
			case 'x':
				break;
			case 'X':
				break;
			default:
				System.out.println("Invalid operation. Try again.");
			}
		}
	}
}
