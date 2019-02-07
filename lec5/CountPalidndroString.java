package lec5;

import java.util.Scanner;

public class CountPalidndroString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(countPalindromicSS(str));
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

	public static int countPalindromicSS(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (isPalindrome(str.substring(i, j + 1)) == true)
					count++;
			}
		}
		return count;
	}

}
