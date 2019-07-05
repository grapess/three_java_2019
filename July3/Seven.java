class Seven
{
	public static void main(String[] args)
	{
		MyLines line = new MyLines();
		line.line4('_',50);
		System.out.println(" Hello ");
		line.line4('-',40);
		System.out.println(" Grapess ");
		line.line4('~',70);
		System.out.println(" Solutions ");
		line.line4('_',60);
	}
}
class MyLines
{
	void line1()
	{
		//System.out.println("----------------------------");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	void line2()
	{
		for( int count = 1; count <= 30; count++ )
		{
			System.out.print("_");
		}
		System.out.println();
	}
	void line3(char symbol)
	{
		for( int count = 1; count <= 30; count++ )
		{
			System.out.print(symbol);
		}
		System.out.println();
	}
	void line4(char symbol,int times)
	{
		for( int count = 1; count <= times; count++ )
		{
			System.out.print(symbol);
		}
		System.out.println();
	}
}