package lec6;

import java.util.Scanner;

public class IsPalin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(IsPalin(str));
	}

	public static boolean IsPalin(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			String ros = str.substring(1, str.length() - 1);
			return IsPalin(ros);
		}

		return false;
	}
}
