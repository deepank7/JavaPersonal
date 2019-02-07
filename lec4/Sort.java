package lec4;

public class Sort {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 4, 50,20 };
		//SelectionSort(arr);
		InsertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	public static void SelectionSort(int[] arr) {
		int n=arr.length;
		for(int counter=0;counter<n-1;counter++)
		{
			int min=counter;
			for(int j=counter+1;j<=n-1;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[counter];
			arr[counter]=arr[min];
			arr[min]=temp;
		}
	}

	public static void InsertionSort(int[] arr) {
		int n=arr.length;
		for(int counter=1;counter<=n-1;counter++)
		{
			int item=arr[counter];
			int j;
			for(j=counter-1; j>=0 && arr[j]>item; j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=item;		
		}
	}

	public static void bubbleSort(int[] arr)
	{
		int n=arr.length;
		for(int counter=0;counter<=n-1;counter++)
		{
			for(int j=0;j<n-counter-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j + 1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
