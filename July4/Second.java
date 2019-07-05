import java.util.*;
class Second
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		int div , temp;
		System.out.println("\n Prime Factor of Given Number ");
		temp = num;
		div = 2;
		while( div <= temp )
		{
			if( temp % div == 0 )
			{
				System.out.print(" [ " + div + " ]");
				temp = temp / div;
			}
			else
			{
				div++;
			}
		}
		System.out.println();
	}
}