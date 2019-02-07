package lec3;

import java.util.Scanner;

public class QuadEquat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;
		int B = b * b;
		int A = 4 * a * c;
		int D = B - A;
		int root1 = (int)(-b + Math.sqrt(D)) / 2 * a;
		int root2 = (int)(-b - Math.sqrt(D)) / 2 * a;
		if (D> 0) {
			System.out.println("Real and Distinct");
			System.out.println(root2 + " " + root1);
		} else if (D == 0) {
			System.out.println("Real and Equal");
			System.out.println(root1);
		} else {
			System.out.println("Imaginary");
		}
	}
}
