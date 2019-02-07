package lec6;

import java.util.Scanner;

public class SubsetProb2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] arr = new int[s];
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		counte(arr, "", 0, target, 0);
		System.out.println(count);
		subset(arr, "", 0, target, 0);
	}
	public static void subset(int[] arr, String ans, int sum, int target, int idx) {
		if (idx == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
			}
			return;
		}
		subset(arr, ans + arr[idx] + " ", sum + arr[idx], target, idx + 1);
		subset(arr, ans, sum, target, idx + 1);
	}
	public static int count=0;
	public static void counte(int[] arr, String ans, int sum, int target, int idx) {
		if (idx == arr.length) {
			if (sum == target) {
				//System.out.print(ans + " ");
				count++;
			}
			return;
		}
		counte(arr, ans + arr[idx] + " ", sum + arr[idx], target, idx + 1);
		counte(arr, ans, sum, target, idx + 1);
	}
}
