package lec16;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
	@Override
	public int compare(Car t, Car o) {
		// TODO Auto-generated method stub
		return o.price - t.price;
	}

}
