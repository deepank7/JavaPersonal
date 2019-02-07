package lec5;

import java.util.ArrayList;

public class ArrListInt {

	public static void main(String[] args) {
		/*int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 15, 20, 25, 30 };
		ArrayList<Integer> list1 = new ArrayList<>();
		list1 = intersection(a, b);
		System.out.println(list1);*/
		int a[]= {9,9,8};
		int b[]= {2};
		System.out.println(sum(a, b));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> list = new ArrayList<>();
		int i=0,j=0;
		while(i<one.length && j<two.length)
		{
			if(one[i]==two[j])
			{	list.add(one[i]);
				i++;
				j++;
			}else if(one[i]<two[j]) {
				i++;
			}else {
				j++;
			}
		}
		return list;
	}

	public static ArrayList<Integer> sum(int[] one, int[] two){
		ArrayList<Integer> list = new ArrayList<>();
		int sum=0;
		int car=0;
		int i=one.length-1;
		int j=two.length-1;
		while(i>=0|| j>=0) {
			sum=car;
			if(i>=0)
			{
				sum=sum+one[i];
			}
			if(j>=0)
			{
				sum=sum+two[j];
			}
			int rem=sum%10;
			list.add(0,rem);
			car=sum/10;
			i--;
			j--;
		}
		if(car!=0)
		{
			list.add(0,car);
		}
		return list;
	}
	
}
