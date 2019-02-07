package lec10;

import java.util.Scanner;

public class NextGreat {
		private int[] data;
		private int tos;

		public NextGreat() {
			data = new int[5];
			tos = -1;
		}

		public NextGreat(int cap) {
			data = new int[cap];
			tos = -1;
		}

		public int size() {
			return tos + 1;
		}

		public boolean isEmpty() {
			return tos == -1;
		}

		public boolean isFull() {
			return tos == data.length - 1;
		}

		public void push(int item) throws Exception {
			if (isFull()) {
				throw new Exception("Already full");
			}
			tos++;
			data[tos] = item;
		}

		public int pop() throws Exception {
			if (isEmpty()) {
				throw new Exception("Stack Empty");
			}
			int res = data[tos];
			tos--;
			return res;
		}

		public int peek() throws Exception {

			if (isEmpty()) {
				throw new Exception("Stack Empty");
			}

			int res = data[tos];
			return res;
		}

		public void display() {
			for (int i = tos; i >= 0; i--) {
				System.out.print(data[i]);
			}
		}

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++) {
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int[] b=nextGreaterEl2(a);
			for(int i=0;i<n;i++) {
				System.out.println(a[i]+","+b[i]);
			}
		}

	}
	public static int[] nextGreaterEl2(int[] arr) throws Exception {
		NextGreat s = new NextGreat(100);
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

}
