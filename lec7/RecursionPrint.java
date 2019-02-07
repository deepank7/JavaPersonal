package lec7;

import java.util.ArrayList;

public class RecursionPrint {

	public static void main(String[] args) {
		//counte("abcd", "");
		//System.out.println(count);
		//printSS("abcd", "");
		//System.out.println();
		// printKPC("14", "");
		 printPermutation("aac", "");
		// PrintPermNoDuplicates("aac", "");
		// coinToss(3, "");
		// coinTossNoConsecutiveHead(3, "", false);
		// boardPath(0, 3, "");
		// mazePath(0, 0, 2, 2, "");
		// mazePathMM(0, 0, 2, 2, "");
	}
		public static int count=0;
	public static void printSS(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans);
			System.out.print(" ");
			count++;
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		printSS(ros, ans); // without char
		printSS(ros, ans + ch); // with char
		//int temp = ch; // with Ascii
		//printSS(ros, ans + temp);
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

       
   }

	public static void printKPC(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			printKPC(ros, ans + code.charAt(i));
		}

	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static void printPermutation(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			printPermutation(ros, ans + ch);
		}

	}

	public static void PrintPermNoDuplicates(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		boolean[] visited = new boolean[256];

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);

			if (visited[ch] == true) {
				continue;
			}
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			PrintPermNoDuplicates(ros, ans + ch);

			visited[ch] = true;
		}
	}

	public static void coinToss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		coinToss(n - 1, ans + "H");
		coinToss(n - 1, ans + "T");
	}

	public static void coinTossNoConsecutiveHead(int n, String ans, boolean wasLastHeadIncluded) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (wasLastHeadIncluded) {
			coinTossNoConsecutiveHead(n - 1, ans + "T", false);
		} else {
			coinTossNoConsecutiveHead(n - 1, ans + "H", true);
			coinTossNoConsecutiveHead(n - 1, ans + "T", false);
		}

	}

	public static void boardPath(int curr, int end, String ans) {

		if (curr == end) {
			System.out.println(ans);
			return;
		}

		if (curr > end) {
			return;
		}

		for (int i = 1; i <= 6; i++) {
			boardPath(curr + i, end, ans + i);
		}
	}

	public static void mazePath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		mazePath(cr + 1, cc, er, ec, ans + "V");
		mazePath(cr, cc + 1, er, ec, ans + "H");
	}

	public static void mazePathMM(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		for (int jump = 1; jump <= er; jump++) {

			mazePathMM(cr + jump, cc, er, ec, ans + "V" + jump);
		}
		for (int jump = 1; jump <= ec; jump++) {
			mazePathMM(cr, cc + jump, er, ec, ans + "H" + jump);
		}
		for (int jump = 1; jump <= er && jump <= ec; jump++) {
			mazePathMM(cr + jump, cc + jump, er, ec, ans + "D" + jump);
		}
	}

	public static void lexicoCount(int curr, int end) {
		
		if(curr>end) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			lexicoCount(curr*10+i, end);
		}
	}
}
