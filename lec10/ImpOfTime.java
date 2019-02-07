package lec10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImpOfTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			q.add(a[i]);
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		int time=0;
		for(int i=0;i<n;) {
			if(b[i]==a[i]) {
				q.remove(a[i]);
				time++;
				i++;
			}else {
				q.add(q.remove());
				time++;
			}
		}
		System.out.println(time);
	}

}
