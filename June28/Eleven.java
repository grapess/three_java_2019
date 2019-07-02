class Eleven
{
	public static void main(String[] args)
	{
		Work ob1 = new Work();
		System.out.println("\n ob value : " + ob1.value );
		System.out.println("\n ob str : " + ob1.str );
		System.out.println("\n ob ans : " + ob1.ans );
		System.out.println("\n ob ele : " + ob1.ele );
	}
}
class Work
{
	int value;
	String str;
	Eleven ele;
	boolean ans;
}