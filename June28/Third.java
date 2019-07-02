import java.util.*;
class Third
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,total;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		total = (int)Math.ceil( Math.log10( num ) );
		System.out.println("\n Total Digit : " + total);
	}
}