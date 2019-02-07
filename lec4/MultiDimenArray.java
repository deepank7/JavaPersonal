package lec4;

import java.util.Scanner;

public class MultiDimenArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//int[][] arr = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 110, 120, 130, 140, 150 },
		//		{ 160, 170, 180, 190, 200 } };
		//SpiralDisplay(arr);
		/*
		 * int[][] arr = takeinput(); display(arr);
		 */

		int[][] arr= {{10,20,30,40},{60,70,80,90}};
		WaveDisplay(arr);
	}

	public static int[][] takeinput() {
		System.out.println("Enter Number of Rows");
		int rows = sc.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < arr.length; row++) {
			System.out.println("cols?" + "row" + row);
			int cols = sc.nextInt();

			arr[row] = new int[cols];
			for (int j = 0; j < arr[row].length; j++) {
				System.out.println("Enter the elements");
				int val = sc.nextInt();
				arr[row][j] = val;
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int j = 0; j < arr[row].length; j++) {
				System.out.print(arr[row][j] + " ");
			}
			System.out.println();
		}
	}

	public static void WaveDisplay(int[][] arr) {
		for (int col = 0; col < 4; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < 2; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int row = 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}

		System.out.println();
	}

	public static void SpiralDisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length;
		while (count < nel) {
			for (int row = minrow; count < nel && row <= maxrow; row++) {
				System.out.println(arr[row][mincol]);
				count++;
			}
			mincol++;
			for (int col = mincol; count < nel && col <= maxcol; col++) {
				System.out.println(arr[maxrow][col]);
				count++;
			}
			maxrow--;
			for (int row = maxrow; count < nel && row >= minrow; row--) {
				System.out.println(arr[row][maxcol]);
				count++;
			}
			maxcol--;
			for (int col = maxcol; count < nel && col >= mincol; col--) {
				System.out.println(arr[minrow][col]);
				count++;
			}
			minrow++;
		}
	}
}
