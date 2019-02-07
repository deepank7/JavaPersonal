package lec4;

import java.util.Scanner;

public class RainWaterTrap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			int sum=0;
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				int leftmax=-1;
				int rightmax=-1;
				for(int j=i;j<n;j++) {
					if(a[j]>rightmax) {
						rightmax=a[j];
					}
				}
				for(int j=i;j>=0;j--) {
					if(a[j]>leftmax) {
						leftmax=a[j];
					}
				}
				int max=Math.min(rightmax, leftmax);
				int el=max-a[i];
				sum+=el;
			}
			System.out.println(sum);
		}
	}

}
