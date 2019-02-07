package lec11;

import lec10.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] na = new int[2 * this.data.length];
			int[] oa = this.data;
			for (int i = 0; i < oa.length; i++) {
				na[i] = oa[i];
			}
			this.data = na;
		}
		super.push(item);
	}
}
