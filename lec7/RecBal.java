package lec7;

import java.util.Scanner;

public class RecBal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		isBal(str);
		if(currcount==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	static int currcount = 0;

	public static void isBal(String str) {
		if(str.length() == 0) {
			return;
		}

		if (str.charAt(0) == '[' || str.charAt(0) == '{' || str.charAt(0) == '(') {
			currcount++;
		} else if (str.charAt(0) == ']' || str.charAt(0) == '}' || str.charAt(0) == ')') {
			currcount--;
		}
		String ros = str.substring(1);
		isBal((ros));
	}

}
