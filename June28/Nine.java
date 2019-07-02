class Nine
{
	public static void main(String[] args)
	{
		Demo obj;
		obj = new Demo();
		obj.value = 1100;
		System.out.println("\n The Value : " + obj.value );
	}
}
class Demo
{
	protected int value;
}