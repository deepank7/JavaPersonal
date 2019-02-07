package lec3;

public class Replace {

	public static void main(String[] args) {
		int n=102;
		int num=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem==0)
				rem=5;
			else
				num=num*10+rem;
			n=n/10;
		}
		System.out.println(num);

	}

}
