package lec10;
import java.util.Scanner;

public class ImpOfTime2 {

	public static void main(String[] args) throws Exception {
		Queue q1=new Queue();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			q1.enque(a[i]);;
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println(ImpofTime(q1, b));
	}
	public static int ImpofTime(Queue q,int[] b) throws Exception{ 
		
        int i = 0;
		int time=0;
		while (!q.isEmpty()) {
			if(b[i]==q.getFront()) {
				q.dequeue();
				time++;
			    i++;
			}else {
				q.enque(q.dequeue());
				time++;
			}
		}
		return time;
	}
		

}
