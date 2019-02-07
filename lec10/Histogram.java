package lec10;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(maxr(a));

	}
	public static int maxr(int[] arr) {
		int min=0,area=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				min=Math.min(arr[i],arr[j]);
				area=Math.max(area,min*(j-i+1));
			}
		}
		return area;
	}
}
