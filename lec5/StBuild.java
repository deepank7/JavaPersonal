package lec5;

public class StBuild {

	public static void main(String[] args) {
		System.out.println(CaseToggle("AcDghi"));
		System.out.println(lowerHigherAscii("gbdx"));
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
