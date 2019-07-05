import java.util.*;
class Six
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,ans,choice;
		System.out.print("\n Enter Any Number : ");
		n1 = sc.nextInt();
		System.out.print("\n Enter Any Number : ");
		n2 = sc.nextInt();
		System.out.println("\n Press 1 For Add These Number ");
		System.out.println(" Press 2 For Subtract These Number ");
		System.out.println(" Press 3 For Divide These Number ");
		System.out.println(" Press 4 For Multiply These Number ");
		System.out.print("\n Enter your Choice : ");
		choice = sc.nextInt();
		switch( choice )
		{
			case 1:
				ans = n1 + n2;
				System.out.println("\n Sum : " + ans );
				break;
			case 2:
				ans = n1 - n2;
				System.out.println("\n Difference : " + ans );
				break;
			case 3:
				if( n2 != 0 )
				{
					ans = n1 / n2;
					System.out.println("\n After Divide, Result : " + ans );
				}
				else
				{
					System.out.println("\n After Divide, Result : Infinity ");
				}
				break;
			case 4:
				ans = n1 * n2;
				System.out.println("\n Product : " + ans );
				break;
			default:
				System.out.println("\n Invalid Choice. Try Again ");
				break;
		}
	}
}
