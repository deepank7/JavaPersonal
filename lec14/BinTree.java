package lec14;

import java.util.LinkedList;
import java.util.Scanner;

public class BinTree {

	Scanner scn = new Scanner(System.in);

	private class Node {

		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinTree() {
		this.root = construct(null, true);
	}

	private Node construct(Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {

			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}

		}

		int item = scn.nextInt();

		// create a new node
		Node nn = new Node();
		nn.data = item;

		System.out.println(nn.data + " has left child ?");
		boolean hlc = scn.nextBoolean();

		if (hlc) {
			nn.left = construct(nn, true);
		}

		System.out.println(nn.data + " has right child ?");
		boolean hrc = scn.nextBoolean();

		if (hrc) {
			nn.right = construct(nn, false);
		}

		return nn;

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

		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lm = max(node.left);
		int rm = max(node.right);

		return Math.max(node.data, Math.max(lm, rm));

	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}

		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);

		return lf || rf;

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

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {

		if (node == null) {
			return 0;
		}

		int ld = diameter(node.left);
		int rd = diameter(node.right);
		int sp = ht(node.left) + ht(node.right) + 2;

		return Math.max(sp, Math.max(ld, rd));

	}

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node node) {

		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}

	private class pair {
		Node node;
		boolean sd;
		boolean ld;
		boolean rd;
	}

	public void preOrderI() {
		LinkedList<pair> stack = new LinkedList<>();
		pair sp = new pair();
		sp.node = this.root;
		stack.addFirst(sp);
		while (!stack.isEmpty()) {
			pair tp = new pair();
			tp = stack.getFirst();
			if (tp.node == null) {
				stack.removeFirst();
				continue;
			}
			if (tp.sd == false) {
				System.out.println(tp.node.data);
				tp.sd = true;
			} else if (tp.ld == false) {
				pair np = new pair();
				np.node = tp.node.left;
				stack.addFirst(np);
				tp.ld = true;
			} else if (tp.rd == false) {
				pair np = new pair();
				np.node = tp.node.right;
				stack.addFirst(np);
				tp.rd = true;
			} else {
				stack.removeFirst();
			}
		}
	}

	public BinTree(int[] pre, int[] in) {
		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (ilo > ihi || plo > phi) {
			return null;
		}
		Node nd = new Node();
		nd.data = pre[plo];

		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				si = i;
				break;
			}
		}
		int nel = si - ilo;
		nd.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nd.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nd;
	}

	class BSTPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	public boolean isBST() {
		return isBST(this.root).isBST;
	}

	private BSTPair isBST(Node node) {
		if (node == null) {
			return new BSTPair();
		}
		BSTPair lp = isBST(node.left);
		BSTPair rp = isBST(node.right);

		BSTPair sp = new BSTPair();
		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

		if (node.data > lp.max && node.data < rp.min && lp.isBST && rp.isBST) {
			sp.isBST = true;
		} else {
			sp.isBST = false;
		}
		
		return sp;
	}
}
