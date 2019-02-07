package lec11;

public class QueueUsingStack {

	DynamicStack pr=new DynamicStack();
	
	public void enqueue(int item) throws Exception {
		DynamicStack s=new DynamicStack();
		while(!pr.isEmpty()) {
			s.push(pr.pop());
		}
		pr.push(item);
		while(!s.isEmpty()) {
			pr.push(s.pop());
		}
	}
	public int deque() throws Exception{
		int res=pr.pop();
		return res;
	}
	public void display() throws Exception{
		pr.display();
	}
}
