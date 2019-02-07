package lec16;

public class LinkedClient {

	public static void main(String[] args) {
		Linkedls<Car> ll=new Linkedls<>();
		Car[] c = new Car[4];
		c[0] = new Car(200, 100, "Black");
		c[1] = new Car(400, 150, "Blue");
		c[2] = new Car(120, 250, "Grey");
		c[3] = new Car(300, 50, "Red");
		ll.addFirst(c[0]);
		ll.addFirst(c[1]);
		ll.addFirst(c[2]);
		ll.addFirst(c[3]);
		ll.display();
		
	}

}
