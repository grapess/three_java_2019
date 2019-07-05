import java.util.*;
class Prime3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		int count = 0;
		boolean isprime = true;
		
		int div,range;
		range = num / 2;
		div = 2;
		while( div <= range )
		{
			count++;
			if( num % div == 0 )
			{
				isprime = false;
				break;
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
		System.out.println("\n Total Count : " + count );
	}
}