package lec4;

public class MatMul {

	public static void main(String[] args) {
	int one[][]= {{1},{1},{1}};
	int two[][]= {{1,1,1}};
	display(MatMul(one, two));
	}
	public static int[][] MatMul(int[][] one,int[][] two)
	{
		int r1=one.length;
		int c1=one[0].length;
		int r2=two.length;
		int c2=two[0].length;
		int prod[][]=new int[r1][c2];
		if(r1!=c2)
		{
			return null;
		}else {
			for(int i=0;i<prod.length;i++)
			{
				for(int j=0;j<prod[0].length;j++)
				{
					int sum=0;
					for(int k=0;k<c1;k++)
					{
						sum+=(one[i][k]*two[k][j]);
					}
					prod[i][j]=sum;
				}
			}
		}
	return prod;	
	}
	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
