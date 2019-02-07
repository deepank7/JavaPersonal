package lec10;

public class Queue {

	protected int[] data;
	protected int f;
	protected int s;

	public Queue() {
		data = new int[5];
		f = 0;
		s = 0;
	}

	public int size() {
		return s;
	}

	public boolean isEmpty() {
		return s == 0;
	}

	public boolean isFull() {
		return s == data.length;
	}

	public void enque(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is already full");
		}
		int rear = (f + s) % data.length;
		data[rear] = item;
		s++;
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int res = data[f];
		data[f] = 0;
		f = (f + 1) % data.length;
		s--;
		return res;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int res = data[f];

		return res;
	}

	public void display() throws Exception {
		for (int i = 0; i < size(); i++) {
			int idx = (i + f) % data.length;
			System.out.println(data[idx]);
		}
	}

}
