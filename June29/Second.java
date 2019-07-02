import java.util.*;
class Second
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,result,rem,temp;
		System.out.print("\n Enter Any Five Digit Number : ");
		num = sc.nextInt();
		
		temp = num;
		
		rem = temp % 10;
		result = ( ( rem + 1 ) % 10 );
		temp = temp / 10;
		
		rem = temp % 10;
		result = ( ( rem + 1 ) % 10 ) * 10 + result;
		temp = temp / 10;
		
		rem = temp % 10;
		result = ( ( rem + 1 ) % 10 ) * 100 + result;
		temp = temp / 10;
		
		rem = temp % 10;
		result = ( ( rem + 1 ) % 10 ) * 1000 + result;
		temp = temp / 10;
		
		rem = temp % 10;
		result = ( ( rem + 1 ) % 10 ) * 10000 + result;
		temp = temp / 10;

		System.out.println("\n Result : " + result );
	}
}