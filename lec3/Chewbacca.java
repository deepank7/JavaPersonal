package lec3;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long []arr=new long[19];
		int count=0;
		while(n!=0) {
			arr[count]=n%10;
			count++;
			n=n/10;
		}
		for(int i=0;i<count;i++)
		{
			if(i==count-1) {
				if(arr[i]>=5 && arr[i]<=8)
				{
					arr[i]=9-arr[i];
				}
			}else {
				if(arr[i]>=5 && arr[i]<=9)
				{
					arr[i]=9-arr[i];
				}
			}
		}
		for(int i = count - 1; i >= 0; i--)
		{
			System.out.print(arr[i]);
		}
	}

}
