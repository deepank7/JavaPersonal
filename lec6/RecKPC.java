package lec6;

import java.util.Scanner;

public class RecKPC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		counte(str, "");
		System.out.println(count);
		printKPC(str, "");

	}

	static int count = 0;

	public static void printKPC(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans);
			System.out.print(" ");
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			printKPC(ros, ans + code.charAt(i));
		}

	}

	public static void counte(String ques, String ans) {

		if (ques.length() == 0) {
			count++;
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			counte(ros, ans + code.charAt(i));
		}
	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jkl";
		else if (ch == '5')
			return "mno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

}
