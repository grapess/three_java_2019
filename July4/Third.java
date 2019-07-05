import java.util.*;
class Third
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		boolean isprime = true;
		
		int div,range;
		range = num - 1;
		div = 2;
		while( div <= range )
		{
			if( num % div == 0 )
			{
				isprime = false;
			}
			div++;
		}
		
		if( isprime )
		{
			System.out.println("\n Given Number is Prime ");
		}
		else
		{
			System.out.println("\n Given Number is Composite ");
		}
	}
}