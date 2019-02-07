package lec16;

public class Linkedls<T> {

	private class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public T getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		return this.head.data;
	}

	public T getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		return this.tail.data;
	}

	public T getAt(int idx) throws Exception {
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data);
			System.out.print(" ");
			temp = temp.next;
		}

	}

	public void addLast(T item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size > 0) {
			this.tail.next = nn;
		}

		if (this.size == 0) {
			this.tail = nn;
			this.head = nn;
			this.size++;
		} else {

			this.tail = nn;
			this.size++;
		}
	}

	public void addFirst(T item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = head;

		if (this.size == 0) {
			this.tail = nn;
			this.head = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public Node getNodeAt(int idx) {
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int idx, T item) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("LL empty");
		}
		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			Node nm1 = getNodeAt(idx - 1);
			Node np1 = getNodeAt(idx);
			nm1.next = nn;
			nn.next = np1;
			this.size++;
		}
	}

	public T removeFirst() throws Exception {
		T res = head.data;
		if (size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return res;
	}

	public T removeLast() throws Exception {
		T res = tail.data;
		if (size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node sm2 = getNodeAt(size - 2);
			sm2.next = null;
		}
		this.size--;
		return res;
	}

	public T removeAt(int idx) throws Exception {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			size--;
			T res = n.data;
			return res;
		}
	}
}
