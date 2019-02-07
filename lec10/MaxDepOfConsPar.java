package lec10;

import java.util.Scanner;
import java.util.Stack;

public class MaxDepOfConsPar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String str=sc.next();
			System.out.println(maxdepth(str));
		}
	}	
		public static int maxdepth(String str) {
			int count=0,maxcount=0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(') {
					count++;
					if(count>maxcount) {
						maxcount=count;
					}
				}
				else if(str.charAt(i)==')') {
					if(count>0) 
						count--; 
					else 		
						return -1;
					}
				}
			if(count!=0) {
				return -1;
			}
			return maxcount;
			}
}
