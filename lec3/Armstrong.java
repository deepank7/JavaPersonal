package lec3;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		printArmstrong(low, high);

	}

	public static void printArmstrong(int low, int high) {
		for (int i = low; i <= high; i++) {
			int nod = numberOfDigits(i);
			if (isArmstrong(i, nod)) {
				System.out.println(i);
			}
		}
	}

	public static int numberOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static boolean isArmstrong(int n,int nod)
	{
		int sum=0;
		int a=n;
		while(a!=0){
			int rem=a%10;
			sum=(int) (sum+Math.pow(rem, nod));
			a=a/10;
		}
		if(n==sum)
			return true;
		else
			return false;
	}
}
