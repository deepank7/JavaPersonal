package lec6;

public class Recursion {

	public static void main(String[] args) {
		// System.out.println(fibb(6));
		// System.out.println(pow(2, 5));
		int arr[] = { 10, 20, 80, 40, 80,80 };
		// System.out.println(MaxArr(arr, 0));
		// System.out.println(findFirstIndex(arr, 0, 80));
		// System.out.println(findLastIndex(arr, 0, 80));
		int b[] = findAllIndex(arr, 0, 80, 0);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static int fact(int n)

	{
		if (n == 1) {
			return 1;
		}
		int fun = fact(n - 1);
		int fn = n * fun;

		return fn;
	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int fun = pow(x, n - 1);
		int fn = fun * x;

		return fn;
	}

	public static int fibb(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int a = fibb(n - 1);
		int b = fibb(n - 2);
		return a + b;
	}

	public static void disparr(int a[], int vidx) {
		if (vidx == a.length) {
			return;
		}
		System.out.println(a[vidx]);
		disparr(a, vidx + 1);
	}

	public static void disparrRev(int a[], int vidx) {
		if (vidx == a.length) {
			return;
		}

		disparrRev(a, vidx + 1);
		System.out.println(a[vidx]);
	}

	public static int MaxArr(int a[], int vidx) {
		if (vidx == a.length - 1) {
			return a[vidx];
		}

		int max = MaxArr(a, vidx + 1);
		// self work
		if (max < a[vidx])
			return a[vidx];

		return max;
	}

	public static int findFirstIndex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == item) {
			return vidx;
		} else {
			int index = findFirstIndex(arr, vidx + 1, item);
			return index;
		}
	}

	public static int findLastIndex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		int recres = findLastIndex(arr, vidx + 1, item);
		if (arr[vidx] == item && recres == -1)
			{return vidx;}
		else {
			return recres;
		}

	}

	public static int[] findAllIndex(int[] arr, int vidx, int item, int count) {
		if (vidx == arr.length) {
			int[] newarr = new int[count];
			return newarr;
		}
		if (arr[vidx] == item) {
			int[] res = findAllIndex(arr, vidx + 1, item, count + 1);
			res[count] = vidx;
			return res;
		} else {
			int[] res = findAllIndex(arr, vidx + 1, item, count);
			return res;
		}

	}

	
}
