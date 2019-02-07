package lec5;

import java.util.Scanner;

public class StrOddEvenChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		System.out.println(lowerHigherAscii(str));
	}
	public static String lowerHigherAscii(String str) {
		
		StringBuilder sb=new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char ch=str.charAt(i);
			if (i%2==0) {
				ch--;
				sb.setCharAt(i, ch);
			} else {
				ch++;
				sb.setCharAt(i, ch);
			}
		}
		return sb.toString();
	}

}
