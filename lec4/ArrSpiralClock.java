package lec4;

import java.util.Scanner;

public class ArrSpiralClock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		SpiralDisplay(a);
	}
	public static void SpiralDisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length;
		while (count < nel) {
			for (int col = mincol; count < nel && col <= maxcol; col++) {
				System.out.print(arr[minrow][col]+", ");
				count++;
			}
			minrow++;
			for (int row = minrow; count < nel && row <= maxrow; row++) {
				System.out.print(arr[row][maxcol]+", ");
				count++;
			}
			maxcol--;
			for (int col = maxcol; count < nel && col >= mincol; col--) {
				System.out.print(arr[maxrow][col]+", ");
				count++;
			}
			maxrow--;
			for (int row = maxrow; count < nel && row >= minrow; row--) {
				System.out.print(arr[row][mincol]+", ");
				count++;
			}
			mincol++;
		}
		System.out.print("END");
	}

}
