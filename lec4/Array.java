package lec4;

public class Array {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//for loop
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		//enhanced for loop
		for(int val:arr) {
			System.out.println(val);
		}

	}

}
