package lec7;

import java.util.ArrayList;

public class RecursionGet {

	public static void main(String[] args) {

		/*
		 * String str = " "; System.out.println(str.length());
		 * 
		 * ArrayList<String> list = new ArrayList<>(); System.out.println(list.size());
		 * 
		 * list.add(str); System.out.println(list.size());
		 */
		System.out.println(getSS("abcd").size());
		System.out.println(getSS("abcd"));
		// System.out.println(getSSAscii("ab"));
		// System.out.println(getKPC("14"));
		// System.out.println(getPermutation("abc"));
		// System.out.println(getBoardPath(0, 10));
		// System.out.println(getMazePath(0, 0, 2, 3));
		//System.out.println(getMazeMM(0, 0, 2, 2));
		//System.out.println(getMazeMM(0, 0, 2, 2).size());
	}

	public static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {

			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add(" ");
			return baseRes;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recRes = getSS(ros);

		ArrayList<String> myRes = new ArrayList<>();

		for (String val : recRes) {
			myRes.add(val);
			myRes.add(ch + val);
		}

		return myRes;

	}

	public static ArrayList<String> getSSAscii(String str) {
		if (str.length() == 0) {

			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recRes = getSSAscii(ros);

		ArrayList<String> myRes = new ArrayList<>();

		for (String val : recRes) {
			myRes.add(val);
			myRes.add(ch + val);
			int temp = ch;
			myRes.add(val + temp);
		}

		return myRes;
	}

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {

			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recRes = getKPC(ros);

		ArrayList<String> myRes = new ArrayList<>();
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {

			for (String val : recRes) {
				myRes.add(code.charAt(i) + val);
			}

		}
		return myRes;
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

	public static ArrayList<String> getPermutation(String str) {

		if (str.length() == 0) {

			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recRes = getPermutation(ros);

		ArrayList<String> myRes = new ArrayList<>();

		for (String tempRes : recRes) {
			for (int i = 0; i <= tempRes.length(); i++) {
				String val = tempRes.substring(0, i) + ch + tempRes.substring(i);
				myRes.add(val);
			}
		}

		return myRes;

	}

	public static ArrayList<String> getBoardPath(int st, int end) {

		if (st == end) {

			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}

		if (st > end) {
			ArrayList<String> baseRes = new ArrayList<>();
			return baseRes;
		}

		ArrayList<String> myRes = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			ArrayList<String> recRes = getBoardPath(st + i, end);
			for (String val : recRes) {
				myRes.add(i + val);
			}
		}
		return myRes;
	}

	public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {

			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		if (cc > ec || cr > er) {

			ArrayList<String> baseRes = new ArrayList<>();
			return baseRes;
		}

		ArrayList<String> myRes = new ArrayList<>();

		ArrayList<String> recRes = getMazePath(cr + 1, cc, er, ec);
		for (String val : recRes) {
			myRes.add("V" + val);
		}
		recRes = getMazePath(cr, cc + 1, er, ec);
		for (String val : recRes) {
			myRes.add("H" + val);
		}
		recRes = getMazePath(cr + 1, cc + 1, er, ec);
		for (String val : recRes) {
			myRes.add("D" + val);
		}

		return myRes;

	}

	public static ArrayList<String> getMazeMM(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {

			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		if (cc > ec || cr > er) {

			ArrayList<String> baseRes = new ArrayList<>();
			return baseRes;
		}

		ArrayList<String> myRes = new ArrayList<>();

		for (int jump = 1; jump <= er; jump++) {
			ArrayList<String> recRes = getMazeMM(cr + jump, cc, er, ec);
			for (String val : recRes) {
				myRes.add("V" + jump + val);
			}
		}
		for (int jump = 1; jump <= ec; jump++) {
			ArrayList<String> recRes = getMazeMM(cr, cc + jump, er, ec);
			for (String val : recRes) {
				myRes.add("H" + jump + val);
			}
		}
		for (int jump = 1; jump <= er && jump <= ec; jump++) {
			ArrayList<String> recRes = getMazeMM(cr + jump, cc + jump, er, ec);
			for (String val : recRes) {
				myRes.add("D" + jump + val);
			}
		}
		return myRes;

	}

}
