package lec11;

import lec10.Stack;

public class DSClient {

	public static void main(String[] args) throws Exception {
		Stack s=new DynamicStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();
	}

}
