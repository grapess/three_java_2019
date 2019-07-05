import java.util.*;
class Prime6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		int count = 0;
		boolean isprime = true;
		
		if( num % 2 == 0 || num % 3 == 0 )
		{
			count = 1;
			isprime = false;
		}
		else
		{
			count = 1;
			int div = 5;			
			while( div * div <= num )
			{
				count++;
				if( num % div == 0 || num % ( div + 2 ) == 0 )
				{
					isprime = false;
					break;
				}
				div += 6;
			}
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