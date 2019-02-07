package lec3;

import java.util.Scanner;

public class DelhiOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int []arr=new int[9];
		while(t>=0)
		{
			int n=sc.nextInt();
			int count=0;
			while(n!=0) {
				arr[count]=n%10;
				count++;
				n=n/10;
			}
			int sum1=0,sum2=0;
			for(int i=count;i>=0;i--)
			{
				if(arr[i]%2==0){
					sum1=sum1+arr[i];
				}else {
				sum2=sum2+arr[i];
				}
			}	
			if(sum1%4==0 || sum2%3==0 )
			{
				System.out.println("Yes");
			}else
			{
				System.out.println("No");
			}
			t--;
		}
	}
}