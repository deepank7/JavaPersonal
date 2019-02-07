package lec5;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		System.out.println(CaseToggle(str));
	}
	public static String CaseToggle(String str) {
		int diff = 'a' - 'A';
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
				sb.setCharAt(i, (char) (sb.charAt(i) + diff));
			} else if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
				sb.setCharAt(i, (char) (sb.charAt(i) - diff));
			}
		}

		return sb.toString();
	}
}
