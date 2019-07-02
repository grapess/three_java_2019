import java.util.*;
class Second
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num,result;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextDouble();
		result = Math.ceil( num );
		System.out.println("\n Ceil Result : " + result);
		result = Math.floor( num );
		System.out.println("\n Floor : " + result);
		result = Math.log10( num );
		System.out.println("\n Log 10 : " + result);
		result = Math.log( num );
		System.out.println("\n Log : " + result);
	}
}