import java.util.*;
class Five
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int total;
		System.out.print("\n Enter Total Price : ");
		total = sc.nextInt();
		if( total > 1000 )
		{
			System.out.println("\n You Got 10% Discount ");
		}
	}
}