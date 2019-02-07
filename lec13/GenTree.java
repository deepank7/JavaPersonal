package lec13;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenTree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenTree() {
		this.root = construct(null, -1);
	}

	// create ith child of a parent
	private Node construct(Node parent, int ith) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.children);
		}

		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("Number of childeren for" + nn.data);
		int noc = sc.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		String str = node.data + "->";
		for (Node child : node.children) {
			str += child.data + " ";
		}
		str += ".";
		System.out.println(str);
		for (Node child : node.children) {
			display(child);
		}
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		int sum = 0;
		for (Node child : node.children) {
			sum += size(child);
		}
		return sum + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int tm = 0;
		for (Node child : node.children) {
			int cm = max(child);
			tm = Math.max(tm, cm);
		}
		return Math.max(tm, node.data);
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node.data == item) {
			return true;
		}
		for (Node child : node.children) {
			boolean cf = find(child, item);
			if (cf) {
				return true;
			}
		}
		return false;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		int th = -1;
		for (Node child : node.children) {
			int ch = ht(child);
			th = Math.max(ch, th);
		}
		return th + 1;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {
		int l = 0;
		int r = node.children.size() - 1;
		while (l < r) {
			Node ln = node.children.get(l);
			Node rn = node.children.get(r);
			node.children.set(r, ln);
			node.children.set(l, rn);
			l++;
			r--;
		}
		for (Node child : node.children) {
			mirror(child);
		}
	}

	public void display2() {
		display2(this.root);
	}

	private void display2(Node node) {
		System.out.println("Hii " + node.data);

		for (Node child : node.children) {
			System.out.println("Going towards " + child.data);
			display2(child);
			System.out.println("Coming back from " + child.data);

		}

		System.out.println("Bye " + node.data);
	}

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node node) {
		System.out.print(node.data + " ");

		for (Node child : node.children) {
			preOrder(child);
		}
	}

	public void postOrder() {
		postOrder(this.root);
	}

	private void postOrder(Node node) {
		for (Node child : node.children) {
			postOrder(child);
		}

		System.out.print(node.data + " ");
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);

		while (!queue.isEmpty()) {

			// remove
			Node rn = queue.removeFirst();

			// print
			System.out.print(rn.data + " ");

			// child
			for (Node child : rn.children) {
				queue.addLast(child);
			}

		}
		System.out.println();
	}

	public void levelOrderLW() {

		LinkedList<Node> primary = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		primary.addLast(this.root);

		while (!primary.isEmpty()) {

			Node rn = primary.removeFirst();

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				helper.addLast(child);
			}

			if (primary.isEmpty()) {
				System.out.println();
				primary = helper;
				helper = new LinkedList<>();
			}

		}

	}

	public void levelOrderZZ() {

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> stack = new LinkedList<>();

		queue.addLast(this.root);

		int count = 0;

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");

			if (count % 2 == 0) {
				for (Node child : rn.children) {
					stack.addFirst(child);
				}
			} else {

				for (int i = rn.children.size() - 1; i >= 0; i--) {
					stack.addFirst(rn.children.get(i));
				}
			}

			if (queue.isEmpty()) {
				count++;
				System.out.println();
				queue = stack;
				stack = new LinkedList<>();
			}

		}

	}

}
