package lec3;

import java.util.Scanner;

public class UpLoIn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Lower");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
