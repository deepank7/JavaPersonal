package lec4;

import java.util.Scanner;

public class ArrQues {

	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i <=n-1; i++) {
			a[i] = sc.nextInt();
		}
		int arr[] = new int[n];
	    arr=inverse(a);
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	    	if(a[i]!=arr[i])
	    	{
	    		count++;
	    	}
	    }
	    if(count>0)
	    {
	    	System.out.println("false");
	    }else {
	    	System.out.println("true");
	    }
    }
   public static int[] inverse(int[] arr)
	{
		int []inv=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			inv[arr[i]]=i;
		}
		return inv;
	}
}