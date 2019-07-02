import java.util.*;
class Four
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		boolean result = num > 1000;
		System.out.println("\n Result : " + result );
	}
}