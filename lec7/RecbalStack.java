package lec7;

import java.util.Scanner;

public class RecbalStack {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack s=new Stack();
		int a=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{') {
				s.push(i);
			}
			if(str.charAt(i)==')' || str.charAt(i)==']' || str.charAt(i)=='}') {
				a=s.pop();
			}
			if(a=='(' || a=='[' || a=='{') {
				
			}
		}
	}

}
