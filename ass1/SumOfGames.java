package ass1;

import java.util.Scanner;

public class SumOfGames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	     while(t>0)
	     {
	    	 int n=sc.nextInt();
	 	     int m=sc.nextInt();
	 	     for(int i=1;i<=11 && n>0;i=i+2)
	 	     {
	 	    	 n=n-i;
	 	     }
	 	     for(int i=2;i<=10 && m>0;i=i+2)
	 	     {
	 	    	 m=m-i;
	 	     }
	    	 t--;
	     }

	}

}
