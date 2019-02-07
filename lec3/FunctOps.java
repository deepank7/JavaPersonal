package lec3;

import java.util.Scanner;

public class FunctOps {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		printallprimes(low, high);
	}
	public static void printallprimes(int low,int high) {
		for(int i=low;i<=high;i++)
		{
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0){
				count++;
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}

}
