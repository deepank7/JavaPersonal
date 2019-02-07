package lec5;

import java.util.Scanner;

public class StrDiffInAsci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(AscDiff(str));
	}

	public static String AscDiff(String str) {

		StringBuilder sb = new StringBuilder(str);
		StringBuilder ans=new StringBuilder();
		for (int i = 0; i < sb.length() - 1; i++) {
			int n = sb.charAt(i + 1) - sb.charAt(i);
			ans.append(sb.charAt(i) + "" + n);
		}
		ans.append(sb.charAt(sb.length()-1));
		return ans.toString();
	}

}
