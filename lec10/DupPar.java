package lec10;

import java.util.Scanner;
import java.util.Stack;

public class DupPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "((a+b))";//sc.next();
		if(findDup(str)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

	public static boolean findDup(String str) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				char top = s.peek();
				s.pop();
				int count = 0;
				while (top != '(') {
					count++;
					top = s.peek();
					s.pop();
				}
				if (count <= 1) {
					return true;
				}
			} else
				s.push(str.charAt(i));
		}
		return false;
	}

}
