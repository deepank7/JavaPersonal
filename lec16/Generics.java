package lec16;

import java.util.Comparator;

public class Generics {

	public static void main(String[] args) {
		Car[] c = new Car[4];
		c[0] = new Car(200, 100, "Black");
		c[1] = new Car(400, 150, "Blue");
		c[2] = new Car(120, 250, "Grey");
		c[3] = new Car(300, 50, "Red");
		//bubbleSort(c, new CarSpeedComparator());
		bubbleSort(c, new CarPriceComparator());
		display(c);
	}

	public static <T> void display(T[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> obj) {
		int n = arr.length;
		for (int counter = 0; counter <= n - 1; counter++) {
			for (int j = 0; j < n - counter - 1; j++) {
				if (obj.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		int n = arr.length;
		for (int counter = 0; counter <= n - 1; counter++) {
			for (int j = 0; j < n - counter - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}