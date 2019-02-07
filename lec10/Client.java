package lec10;

import java.awt.DisplayMode;

public class Client {

	public static void main(String[] args) throws Exception {
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		// displayRev(s1);
		// s1.display();
		Stack st = new Stack();
		actualReverse(s1, st);
		displayRev(s1);
	}

	public static void displayRev(Stack s) throws Exception {
		if (s.isEmpty()) {
			return;
		}
		int a = s.pop();
		displayRev(s);
		System.out.println(a);
		s.push(a);
	}

	public static void actualReverse(Stack s, Stack st) throws Exception {
		if (s.isEmpty()) {
			fill(s, st);
			return;
		}
		int a = s.pop();
		st.push(a);
		actualReverse(s, st);
	}

	public static void fill(Stack s, Stack st) throws Exception {
		if (st.isEmpty()) {
			return;
		}
		int t = st.pop();
		fill(s, st);
		s.push(t);
	}

}
