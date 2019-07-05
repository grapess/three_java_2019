import java.util.*;
class First
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.print("\n Enter Any Number : ");
		n1 = sc.nextInt();
		System.out.print("\n Enter Any Number : ");
		n2 = sc.nextInt();
		int x = n1;
		int y = n2;
		int rem;
		while( x % y != 0 )
		{
			rem = x % y;
			x = y;
			y = rem;
		}
		int hcf = y;
		int lcm = ( n1 * n2 ) / hcf;
		System.out.println("\n HCF : " + hcf + " LCM : " + lcm );
	}
}