package lec5;

import java.util.Scanner;

public class StringOps {

	public static void main(java.lang.String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		// System.out.println(isPalindrome(str));
		// substrings(str);
		// System.out.println(countPalindromicSS(str));
		RevString(str);
	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void substrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				System.out.println(str.substring(i, j + 1));
			}
		}
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

	public static void RevString(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)=='+' ||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='-'){
				System.out.print(str.substring(i+1, str.length()));
				System.out.print(str.substring(i,i+1 ));
				System.out.print(str.substring(0,i ));
			}
		}
	}
}
