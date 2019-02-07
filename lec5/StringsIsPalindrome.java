package lec5;

import java.util.Scanner;

public class StringsIsPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(isPalindrome(str)==true);

	}
	public static boolean isPalindrome(String str) {
		String s1;
		int n = str.length();
		int count = 0;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
