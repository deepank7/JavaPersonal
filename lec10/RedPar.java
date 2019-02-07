package lec10;

import java.util.Scanner;
import java.util.Stack;

public class RedPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {	
			String str = sc.next();
			if(findDup(str)) {
				System.out.println("Duplicate");
			}else {
				System.out.println("Not Duplicates");
			}
		}	
	}

	public static boolean findDup(String str) {
		Stack<Character> stack = new Stack<Character>();
		 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
            } else {
                if (stack.peek() == '(') {
                    return true;
                }
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }
        return false;
	}
}
