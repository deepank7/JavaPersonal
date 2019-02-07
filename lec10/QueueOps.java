package lec10;

public class QueueOps {

	public static void main(String[] args) throws Exception {
//		Queue q1=new Queue();
//		q1.enque(10);
//		q1.enque(20);
//		q1.enque(30);
//		q1.enque(40);
//		actualRev(q1);
//		q1.display();
//		displayRev(q1, 0);
//		q1.display();
		int[] arr = { -3, -1, 8, 6, -4, -8, -9, 10 };
		firstNegativeInteger(arr, 4);

	}

	public static void actualRev(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int a = q.dequeue();
		actualRev(q);
		// System.out.println(a);
		q.enque(a);
	}

	public static void displayRev(Queue q, int count) throws Exception {
		if (count == q.size()) {
			return;
		}
		int a = q.dequeue();
		q.enque(a);
		displayRev(q, count + 1);
		System.out.println(a);
	}

	public static void firstNegativeInteger(int[] arr, int k) throws Exception {
		Queue q = new Queue();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				q.enque(i);
			}
		}
		for (int i = k; i < arr.length; i++) {
			if (q.isEmpty()) {
				System.out.println(0);
			} else {
				System.out.println(arr[q.getFront()]);
			}
			//
			if (!q.isEmpty() && q.getFront() <= i - k) {
				q.dequeue();
			}
			if (arr[i] < 0) {
				q.enque(i);
			}
		}
		if (q.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(arr[q.getFront()]);
		}

	}

	public static void maxOfSubarr(int[] arr, int k) throws Exception {
		Queue q = new Queue();
		for (int i = 0; i < k; i++) {
			if (arr[i] < arr[i+1]) {
				q.enque(i);
			}
		}
		
	}
}
