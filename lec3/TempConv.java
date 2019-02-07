package lec3;

import java.util.Scanner;

public class TempConv {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int step=sc.nextInt();
		for(int temp=min;temp<=max;temp=temp+step)
		{
			int c=(int)((5.0/9)*(temp-32));
			System.out.println(temp+"\t"+c);
		}
	}
	
}
