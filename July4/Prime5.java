import java.util.*;
class Prime5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		int count = 0;
		boolean isprime = true;
		
		if( num % 2 == 0 )
		{
			count = 1;
			isprime = false;
		}
		else
		{
			int div,range;
			range = (int)Math.sqrt( num );
			div = 3;
			count = 1;
			while( div <= range )
			{
				count++;
				if( num % div == 0 )
				{
					isprime = false;
					break;
				}
				div += 2;
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