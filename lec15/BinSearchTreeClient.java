package lec15;

public class BinSearchTreeClient {

	public static void main(String[] args) {
		int[] in = { 10, 20, 30, 40, 50, 60, 70 };
		BinSearchTree bt=new BinSearchTree(in);
		bt.display();
		bt.range(15, 51);
		bt.printDec();
		//bt.replaceWithSumLarger();
		//bt.display();
		bt.remove(10);
		bt.display();
	}

}
