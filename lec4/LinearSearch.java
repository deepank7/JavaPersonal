package lec4;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 4, 50,20 };
		/*
		 * reverse(arr); for(int i=0;i<=4;i++) { System.out.println(arr[i]); }
		 */
//		int[] arr2 = rotate(arr, 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//linearSearch(arr, item);
	}

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item)
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (item > arr[mid]) {
				low = mid + 1;
			} else if (item < arr[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void reverse(int[] arr) {
		/*for (int i = 0; i < arr.length / 2; i++) {
			int temp;
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - i - 1] = temp;
		}*/
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}

	public static int[] rotate(int[] arr, int rot) {
		/*int[] arr2 = new int[5];
		rot = rot % 5;
		for (int i = arr.length - 1; i >= arr.length - rot; i--) {
			arr2[arr.length - i] = arr[i];
		}
		for (int i = 0; i <= arr.length - 1 - rot; i++) {
			arr2[rot+i] = arr[i];
		}
		return arr2;
*/     int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(i<rot) {
				ans[i]=arr[i+(arr.length-rot)];
			}else {
				ans[i]=arr[i-rot];}
		}
		return ans;
	}

	public static int[] inverse(int[] arr)
	{
		int []inv=new int[arr.length];
		for(int i=0;i<=4;i++)
		{
			inv[arr[i]]=i;
		}
		return inv;
	}
	
}