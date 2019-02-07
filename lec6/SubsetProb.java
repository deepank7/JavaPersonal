package lec6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class SubsetProb {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int[] arr=new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		int n = arr.length;
		counte1(arr, n, sum);
		System.out.println(count);
		printAllSubsets(arr, n, sum);
		
	}
	public static int count=0;
	static void printAllSubsetsRec(int arr[], int n, ArrayList<Integer> v, int sum) {
		if (sum == 0) {
			for (int i = v.size()-1; i >= 0; i--)
				System.out.print(v.get(i) + " ");
			System.out.print(" ");
			return;
		}
		if (n == 0)
			return;
		ArrayList<Integer> v1=new ArrayList<>(v);
		v1.add(arr[n - 1]);
		printAllSubsetsRec(arr, n - 1, v1, sum - arr[n - 1]);
		printAllSubsetsRec(arr, n - 1, v, sum);
	}

	static void printAllSubsets(int arr[], int n, int sum) {
		ArrayList<Integer> v=new ArrayList<>();
		printAllSubsetsRec(arr, n, v, sum);
	}
	static void counte(int arr[], int n, Vector<Integer> v, int sum) {
		if (sum == 0) {
			for (int i = 0; i < v.size(); i++)
				v.get(i);
			count++;
			return;
		}
		if (n == 0)
			return;
		counte(arr, n - 1, v, sum);
		Vector<Integer> v1 = new Vector<Integer>(v);
		v1.add(arr[n - 1]);
		counte(arr, n - 1, v1, sum - arr[n - 1]);
	}

	static void counte1(int arr[], int n, int sum) {
		Vector<Integer> v = new Vector<Integer>();
		counte(arr, n, v, sum);
	}
}
