package lec9;

public class Mersrt {

	public static void main(String[] args) {
		int[] a = { 20, 10, 30, 5, 3, 2, 40, 15 };
		int[] sorted = mergeSort(a, 0, a.length - 1);

		for (int val : sorted) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int[] merge(int[] one, int[] two) {
		int i = 0, j = 0, k = 0;
		int n = one.length;
		int m = two.length;
		int[] merged = new int[n + m];
		while (i < n && j < m) {
			if (one[i] <= two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			} else {
				merged[k] = two[j];
				j++;
				k++;
			}
		}
		if (i == n) {
			while (j < m) {
				merged[k] = two[j];
				j++;
				k++;
			}
		}
		if (j == m) {
			while (i < n) {
				merged[k] = one[i];
				i++;
				k++;
			}
		}
		return merged;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] ar = new int[1];
			ar[0] = arr[hi];
			return ar;

		}

		int mid = (lo + hi) / 2;
		int[] a1 = mergeSort(arr, lo, mid);
		int[] a2 = mergeSort(arr, mid + 1, hi);
		int[] ans = merge(a1, a2);

		return ans;
	}
}
