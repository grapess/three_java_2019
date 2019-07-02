import java.util.*;
class First
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num,result;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextDouble();
		result = Math.sqrt( num );
		System.out.println("\n Square Root : " + result);
		result = Math.pow( num , 3);
		System.out.println("\n Cube of Given Number : " + result);
	}
}