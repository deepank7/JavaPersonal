package lec8;

import java.util.Scanner;

public class GenPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GenParen(n, "", 0, 0);
		// System.out.println(wildcard("abcc", "a*?"));
	}

	public static void GenParen(int n, String ans, int open, int close) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;
		}

		GenParen(n, ans + ")", open, close + 1);
		GenParen(n, ans + "(", open + 1, close);
	}

	public static boolean wildcard(String src, String pat) {
		if (src.length() == 0 && pat.length() == 0) {
			return true;
		}
		if (src.length() != 0 && pat.length() == 0) {
			return false;
		}
		if (src.length() == 0 && pat.length() != 0) {
			for (int i = 0; i < pat.length(); i++) {
				if (pat.charAt(i) != '*')
					return false;
			}

			return true;
		}
		char srch = src.charAt(0);
		char patch = pat.charAt(0);

		String srcros = src.substring(1);
		String patros = pat.substring(1);

		boolean rr;
		if (srch == patch || patch == '?') {
			rr = wildcard(srcros, patros);
		} else if (patch == '*') {
			rr = wildcard(src, patros) || wildcard(srcros, pat);
		} else {
			rr = false;
		}
		return rr;
	}
}
