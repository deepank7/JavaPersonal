package lec12;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
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

	public void addLast(int item) {
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

	public void addFirst(int item) {
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

	public void addAt(int idx, int item) throws Exception {
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

	public int removeFirst() throws Exception {
		int res = head.data;
		if (size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return res;
	}

	public int removeLast() throws Exception {
		int res = tail.data;
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

	public int removeAt(int idx) throws Exception {
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
			int res = n.data;
			return res;
		}
	}

	public void ReverseDI() {
		int l = 0;
		int r = size - 1;
		while (l < r) {
			Node lh = getNodeAt(l);
			Node rh = getNodeAt(r);
			int temp = lh.data;
			lh.data = rh.data;
			rh.data = temp;
			l++;
			r--;
		}
	}

	public void reversePI() {
		Node prev = head;
		Node curr = head.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node temp = head;
		head = tail;
		tail = temp;

		this.tail.next = null;
	}

	public void reversePR() {
		reversePR(head, head.next);
		Node temp = head;
		head = tail;
		tail = temp;

		this.tail.next = null;

	}

	private void reversePR(Node prev, Node curr) {
		if (curr == null) {
			return;
		}
		reversePR(curr, curr.next);
		curr.next = prev;
	}

	public void reverseDR() {
		reverseDR(this.head, this.head, 0);

	}

	private Node reverseDR(Node left, Node right, int count) {
		if (right == null) {
			return left;
		}
		left = reverseDR(left, right.next, count + 1);
		if (count > size / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
		}
		return left.next;
	}

	private class HeapMover {
		Node left;
	}

	public void reverseDRHeap() {
		HeapMover mover = new HeapMover();
		mover.left = this.head;
		reverseDRHeap(mover, head, 0);
	}

	private void reverseDRHeap(HeapMover mover, Node right, int count) {
		if (right == null) {
			return;
		}

		reverseDRHeap(mover, right.next, count + 1);
		if (count >= size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
		}
		mover.left = mover.left.next;
	}

	public void fold() {
		fold(head, head, 0);

	}

	private Node fold(Node l, Node r, int count) {
		if (r == null) {
			return l;
		}
		l = fold(l, r.next, count + 1);
		Node temp = null;
		if (count > size / 2) {
			temp = l.next;
			l.next = r;
			r.next = temp;
		}
		if (count == size / 2) {
			tail = r;
			tail.next = null;
		}
		return temp;
	}

	public int mid() {
		return mid(head, head);
	}

	private int mid(Node l, Node r) {
		if (r.next == null || r.next.next == null) {
			return l.data;
		}
		return mid(l.next, r.next.next);
	}

	public int kthFromLast(int k) {
		Node slow = head;
		Node fast = head;
		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public void kReverse(int k) throws Exception {
		LinkedList prev = null;
		while (size != 0) {
			LinkedList curr = new LinkedList();
			for (int i = 1; i <= k; i++) {
				curr.addFirst(this.removeFirst());
			}
			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.size += curr.size;
				prev.tail = curr.tail;
			}
		}
		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;

	}

	public LinkedList mergetwoSorted(LinkedList other) {
		Node temp1 = this.head;
		Node temp2 = other.head;
		LinkedList sorted = new LinkedList();
		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				sorted.addLast(temp1.data);
				temp1 = temp1.next;
			} else {
				sorted.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}
		if (temp1 == null) {
			while (temp2 != null) {
				sorted.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}
		if (temp2 == null) {
			while (temp1 != null) {
				sorted.addLast(temp1.data);
				temp1 = temp1.next;
			}
		}
		return sorted;
	}

	private Node midnode() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public void mergeSort() {

		if (this.size == 1)
			return;

		Node middle = midnode();
		Node midnnext = middle.next;
		LinkedList fh = new LinkedList();
		fh.head = this.head;
		fh.tail = middle;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;

		LinkedList sh = new LinkedList();
		sh.head = midnnext;
		sh.tail = this.tail;
		sh.tail.next = null;
		sh.size = this.size / 2;

		fh.mergeSort();
		sh.mergeSort();
		LinkedList merged = fh.mergetwoSorted(sh);
		this.head = merged.head;
		this.tail = merged.tail;
		this.size = merged.size;
	}

	public void dummyLinkedList() {
		Node n1 = new Node();
		n1.data = 10;
		Node n2 = new Node();
		n2.data = 20;
		Node n3 = new Node();
		n3.data = 30;
		Node n4 = new Node();
		n4.data = 40;
		Node n5 = new Node();
		n5.data = 50;
		Node n6 = new Node();
		n6.data = 60;

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n3;

		this.head = n1;
		this.tail = null;
	}

	public void breakloop() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}
		if (slow == fast) {
			Node start = this.head;
			Node loop = slow;
			while (loop.next != start.next) {
				start = start.next;
				loop = loop.next;
			}
			loop.next = null;
		} else {
			System.out.println("No Loop");
		}
	}
}
