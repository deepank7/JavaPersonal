package lec4;

import java.util.Scanner;

public class ArrSumTrip {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int tar=sc.nextInt();
		for(int counter=0;counter<=n-1;counter++)
		{
			for(int j=0;j<a.length-counter-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j + 1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					sum=a[i]+a[j]+a[k];
					if(sum==tar)
					{
						System.out.println(a[i]+", "+a[j]+" and "+a[k]);
					}
				}	
			}
		}

	}

}
