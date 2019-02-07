package lec14;

public class BinTreeClient {

	public static void main(String[] args) {
		// 10 true 20 true 40 false false true 50 false false true 30 false false
//		BinTree bt = new BinTree();
//		bt.display();
//		System.out.println(bt.isBST());
////		bt.preOrder();
//		bt.preOrderI();
		int[] pre = { 10, 5, 3, 7, 20, 16, 25 };
		int[] in = { 3, 5, 7, 10, 16, 20, 25 };
//		int[] post = { 40, 20, 60, 70, 50, 30, 10 };
		BinTree ob = new BinTree(pre, in);
		ob.display();
		System.out.println(ob.isBST());
//		ob.display();
		
	}

}
