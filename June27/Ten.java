import java.util.*;
class Ten
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num, sum , rem;
		System.out.print("\n Enter Any Five Digit Number : ");
		num = sc.nextInt();
		
		rem = num % 10;
		sum = rem;
		num = num / 10;
		
		rem = num % 10;
		sum = sum + rem;
		num = num / 10;
		
		rem = num % 10;
		sum = sum + rem;
		num = num / 10;
		
		rem = num % 10;
		sum = sum + rem;
		num = num / 10;
		
		rem = num % 10;
		sum = sum + rem;
		num = num / 10;
		
		System.out.println("\n Sum of Digit of Given Number : " + sum );
	}
}