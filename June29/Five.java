import java.util.*;
class Five
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int year, total, rem;
		System.out.print("\n Enter Any Year : ");
		year = sc.nextInt();
		// Normal Year 365 days = 52 Weeks + 1 day
		// Leap Year 366 days  = 52 Weeks + 2 day
		total = ( year - 1 ) * 365; // 2000
		total += ( year - 1 ) / 4; // 500 
		total -= ( year - 1 ) / 100; // 20
		total += ( year - 1 ) / 400; // 5
		rem = total % 7;
		String result = "\n On 1st January, " + year + " has ";
		if( rem == 0 )
		{
			result += "Monday";
		}
		else
		{
			if( rem == 1 )
			{
				result += "Tuesday";
			}
			else
			{
				if( rem == 2 )
				{
					result += "Wednesday";
				}
				else
				{
					if( rem == 3 )
					{
						result += "Thursday";
					}
					else
					{
						if( rem == 4 )
						{
							result += "Friday";
						}
						else
						{
							if( rem == 5 )
							{
								result += "Satruday";
							}
							else
							{
								result += "Sunday";
							}
						}
					}
				}
			}
		}
		result += ".";
		System.out.println( result );
	}
}