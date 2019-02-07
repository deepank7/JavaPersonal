package lec10;

import java.util.Scanner;
import java.util.Stack;

public class PrateekSirAndCoding {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 2) {
				int num = sc.nextInt();
				s.push(num);
			} else {
				if (!s.isEmpty()) {
					System.out.println(s.peek());
					s.pop();
				} else {
					System.out.println("No Code");
				}
			}
		}
	}

}
