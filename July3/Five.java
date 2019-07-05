import java.util.*;
class Five
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num, temp , rem, sum;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		sum = 0;
		temp = num;
		if( temp < 0 )
		{
			temp = temp * -1;
		}
		while( temp > 0 )
		{
			rem = temp % 10;
			sum = sum + rem;
			temp = temp / 10;
		}
		System.out.println("\n Sum of Digit : " + sum );
	}
}