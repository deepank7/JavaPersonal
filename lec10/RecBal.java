package lec10;

import java.util.Scanner;
import java.util.Stack;

public class RecBal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(isBal(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	static boolean isBal(String str) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' ||str.charAt(i) == '{' || str.charAt(i) == '[') {
				s.push(str.charAt(i));
			}
			if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
				if (s.isEmpty()) 
	               { 
					return false; 
	               }
				else if (!isMatchingPair(s.pop(), str.charAt(i)) ) 
	               { 
					return false; 
	               }
			}
		}
		if (s.isEmpty()) 
	         return true; /*balanced*/
	       else
	         {   /*not balanced*/
	             return false; 
	         }  
	}
	static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true;
       else if (character1 == '{' && character2 == '}') 
           return true; 
         else if (character1 == '[' && character2 == ']') 
           return true; 
       else
         return false; 
    } 
}
