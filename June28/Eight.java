import java.util.*;
class Eight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 , num2;
		System.out.print("\n Enter First  Number : ");
		num1 = sc.nextInt();
		System.out.print("\n Enter Second Number : ");
		num2 = sc.nextInt();
		if( num1 == num2 )
		{
			System.out.println("\n Both Number are Equal ");
		}
		else
		{
			if( num1 > num2 )
			{
				System.out.println("\n First Number is Largest ");
			}
			else
			{
				System.out.println("\n Second Number is Largest ");
			}
		}
	}
}