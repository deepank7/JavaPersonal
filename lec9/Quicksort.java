package lec9;

public class Quicksort {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 30, 5, 3, 2, 40, 15 };
		quickSort(arr, 0, arr.length - 1);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int l = lo;
		int r = hi;
		while (l <= r) {
			while (arr[l] < pivot) {
				l++;
			}
			while (arr[r] > pivot) {
				r--;
			}

			if (l <= r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		quickSort(arr, lo, r);
		quickSort(arr, l, hi);

	}
}
