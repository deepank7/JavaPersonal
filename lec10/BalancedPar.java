package lec10;

import java.util.Scanner;
import java.util.Stack;

public class BalancedPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (isBal(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static boolean isBal(String str) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				s.push(str.charAt(i));
			}
			if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
				if (s.isEmpty()) {
					return false;
				} else if (!Match(s.pop(), str.charAt(i))) {
					return false;
				}
			}
		}
		if (s.isEmpty())
			return true;
		else {
			return false;
		}
	}

	static boolean Match(char c1, char c2) {
		if (c1 == '(' && c2 == ')')
			return true;
		else if(c1 == '{' && c2 == '}') 
			return true;
		else if(c1 == '[' && c2 == ']') 
			return true;
		else	
			return false;
	}
}
