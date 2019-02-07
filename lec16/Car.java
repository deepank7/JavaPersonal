package lec16;

public class Car implements Comparable<Car> {
	int speed;
	int price;
	String color;

	public Car(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	public String toString() {
		return " P: " + this.price + " S: " + this.speed + " C: " + this.color;
	}

	@Override
	public int compareTo(Car o) {
		return this.speed - o.speed;
	}

}
