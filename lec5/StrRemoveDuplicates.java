package lec5;

import java.util.Scanner;

public class StrRemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(RemoveDup(str));
	}

	public static String RemoveDup(String str) {
		StringBuilder sb = new StringBuilder(str);
		StringBuilder ans = new StringBuilder();
		int count = 1;
		char last = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				if (count > 1) {
					ans.append("" + last);
				} else {
					ans.append(last);
				}
				count = 1;
				last = str.charAt(i);
			}
		}
		if (count > 1) {
			ans.append("" + last);
		} else {
			ans.append(last);
		}

		return ans.toString();
	}

}
