package lec13;

public class Client {

	public static void main(String[] args) {
		GenTree gt=new GenTree();
		gt.display();
		System.out.println(gt.size());
		System.out.println(gt.max());
		System.out.println(gt.find(50));
		System.out.println(gt.ht());
	}

}
