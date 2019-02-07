package lec15;

public class BinSearchTree {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinSearchTree(int[] in) {
		this.root = construct(in, 0, in.length - 1);
	}

	private Node construct(int[] in, int ilo, int ihi) {
		if (ilo > ihi) {
			return null;
		}

		int mid = (ilo + ihi) / 2;
		Node nd = new Node();
		nd.data = in[mid];

		nd.left = construct(in, ilo, mid - 1);
		nd.right = construct(in, mid + 1, ihi);

		return nd;
	}

	public void display() {

		System.out.println("-----------");
		display(this.root);
		System.out.println("-----------");
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}

		str += " -> " + node.data + " <- ";

		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {

		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node.right == null) {
			return node.data;
		}

		return max(node.right);

	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;

	}

	public void range(int lo, int hi) {
		range(this.root, lo, hi);
	}

	private void range(Node node, int lo, int hi) {
		if (node == null) {
			return;
		}

		if (node.data >= lo && node.data <= hi) {
			range(node.left, lo, hi);
			System.out.print(node.data + " ");
			range(node.right, lo, hi);
		}

		if (node.data < lo) {
			range(node.right, lo, hi);
		}
		if (node.data > hi) {
			range(node.left, lo, hi);
		}

	}

	public void printDec() {
		printDec(this.root);
	}

	private Node printDec(Node node) {
		if (node == null) {
			return null;
		}
		printDec(node.right);
		System.out.println(node.data);
		printDec(node.left);

		return node;
	}

	private class HeapMover {
		int sum = 0;
	}

	public void replaceWithSumLarger() {
		HeapMover mover = new HeapMover();
		replaceWithSumLarger(this.root, mover);
	}

	private void replaceWithSumLarger(Node node, HeapMover mover) {
		if (node == null) {
			return;
		}
		replaceWithSumLarger(node.right, mover);
		int temp = node.data;
		node.data = mover.sum;
		mover.sum += temp;
		replaceWithSumLarger(node.left, mover);
	}

	public void add(int item) {
		add(this.root, item);
	}

	private void add(Node node, int item) {
		if (node == null) {
			return;
		}
		if (item > node.data) {
			if (node.right != null) {
				add(node.right, item);
			} else {
				Node nd = new Node();
				nd.data = item;
				node.right = nd;
			}
		} else if (item < node.data) {
			if (node.left != null) {
				add(node.left, item);
			} else {
				Node nd = new Node();
				nd.data = item;
				node.left = nd;
			}
		}
	}

	public void remove(int item) {
		remove(this.root, null, item);
	}

	private void remove(Node node, Node parent, int item) {
		if (node == null) {
			return;
		}
		if (item > node.data) {
			remove(node.right, node, item);
		} else if (item < node.data) {
			remove(node.left, node, item);
		} else {
			if (node.left == null && node.right == null) {
				if (node.data > parent.data) {
					parent.right = null;
				} else {
					parent.left = null;
				}
			} else if (node.left == null && node.right != null) {
				if (node.data < parent.data) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else if (node.right == null && node.left != null) {
				if (node.data < parent.data) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else {
				int temp = max(node.left);
				remove(node.left, node, temp);
				node.data = temp;
			}
		}
	}
}
