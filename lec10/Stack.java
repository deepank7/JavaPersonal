package lec10;

public class Stack {

	protected int[] data;
	protected int tos;

	public Stack() {
		data = new int[5];
		tos = -1;
	}

	public Stack(int cap) {
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
			System.out.println(data[i]);
		}
	}
}
