package lec6;

import java.util.Scanner;

public class RecAsciiSS {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		counte(str, "");
		System.out.println(count);
		printSSAscii(str, "");
	}

	static int count = 0;

	public static void printSSAscii(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans);
			System.out.print(" ");
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		printSSAscii(ros, ans); // without char
		printSSAscii(ros, ans + ch); // with char
		int temp = ch; // with Ascii
		printSSAscii(ros, ans + temp);

	}

	public static void counte(String ques, String ans) {

		if (ques.length() == 0) {
			count++;
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		counte(ros, ans); // without char
		counte(ros, ans + ch); // with char
		int temp = ch;
		counte(ros,ans+temp);
	}

}
