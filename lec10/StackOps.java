package lec10;

public class StackOps {

	public static void main(String[] args) throws Exception {
		int[] arr = { 2, 6, 8, 3, 9, 1, 0 };
		int[] a = { 100, 20, 30, 90, 60, 50 };
		int[] b=new int[a.length];
		b=stockSpan(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
//		a=nextGreaterEl2(arr);
//		for(int val: a) {
//			System.out.println(val);
//		}
		// nextGreaterEl(arr);
	}

	public static void nextGreaterEl(int[] arr) throws Exception {
		Stack s = new Stack(10);
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && s.peek() < arr[i]) {
				System.out.println(s.pop() + "->" + arr[i]);
			}
			s.push(arr[i]);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + "->" + -1);
		}
	}

	public static int[] nextGreaterEl2(int[] arr) throws Exception {
		Stack s = new Stack(100);
		int[] ans = new int[arr.length ];
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
				ans[s.pop()] = arr[i];
			}
			s.push(i);
		}
		while (!s.isEmpty()) {
			ans[s.pop()] = -1;
		}
		return ans;
	}

	public static int[] stockSpan(int[] arr) throws Exception {
		Stack s = new Stack(10);
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - s.peek();
			}
			s.push(i);
		}
		return ans;
	}


}
