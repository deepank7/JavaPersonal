package lec3;

import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(convert0To5(n));
		int sum=0;
		if(n==0)
			{sum=5;}
		/*else
			{
			while(n!=0)
				int rem=n%10;
				sum=sum
				n=n/10;
			}
*/	}
	static int convert0To5Rec(int num) 
    { 
        // Base case 
        if (num == 0) 
            return 0; 
          
        // Extraxt the last digit and change it if needed 
        int digit = num % 10;  
        if (digit == 0) 
            digit = 5; 
  
        // Convert remaining digits and append the  
        // last digit 
        return convert0To5Rec(num / 10) * 10 + digit; 
    } 
  
    // It handles 0 and calls convert0To5Rec() for 
    // other numbers 
    static int convert0To5(int num) 
    { 
        if (num == 0) 
            return 5; 
        else
            return convert0To5Rec(num); 
    }
}
