package lec11;

import lec10.Queue;

public class DynamicQueue extends Queue {
	@Override
	public void enque(int item) throws Exception {
		if (isFull()) {
			int[] na = new int[2 * this.data.length];
			int[] oa = this.data;
			for (int i = 0; i < size(); i++) {
				int idx = (i + f) % data.length;
				na[i] = oa[idx];
			}
			this.data = na;
			this.f = 0;
		}
		super.enque(item);

	}
}