import java.util.*;
class Six
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("\n Enter First  Number : ");
		n1 = sc.nextInt();
		System.out.print("\n Enter Second Number : ");
		n2 = sc.nextInt();
		System.out.print("\n Enter Third  Number : ");
		n3 = sc.nextInt();
		String result = "";
		if( n1 == n2 )
		{
			if( n1 == n3 )
			{
				result = "\n All Three Number are Equal ";
			}
			else if( n1 > n3 )
			{
				result = "\n First and Second Number are Largest ";
			}
			else
			{
				result = "\n Third Number is Largest";
			}
		}
		else if( n1 == n3 )
		{
			if( n1 > n2 )
			{
				result = "\n First and Third Number are Largest";
			}
			else
			{
				result = "\n Second Number is Largest";
			}
		}
		else if( n2 == n3 )
		{
			if( n2 > n1 )
			{
				result = "\n Second and Third Number are Largest";
			}
			else
			{
				result = "\n First Number is Largest ";
			}
		}
		else if( n1 > n2 )
		{
			if( n1 > n3 )
			{
				result = "\n First Number is Largest ";
			}
			else
			{
				result = "\n Third Number is Largest";
			}
		}
		else if( n2 > n3 )
		{
			result = "\n Second Number is Largest ";
		}
		else
		{
			result = "\n Third Number is Largest";
		}
		System.out.println( result );
	}
}