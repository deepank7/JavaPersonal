package lec10;

import java.util.Scanner;

public class StockSpan {
	private int[] data;
	private int tos;

	public StockSpan() {
		data = new int[5];
		tos = -1;
	}

	public StockSpan(int cap) {
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
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[a.length];
		b=stockSpan(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.println("END");

	}
	public static int[] stockSpan(int[] arr) throws Exception {
		StockSpan s = new StockSpan(100);
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
