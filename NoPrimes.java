import java.util.Scanner;

public class NoPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	int count=0;
            for(int j=1;j<=n;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
            	System.out.println(i);
            }
        }
	}

}
