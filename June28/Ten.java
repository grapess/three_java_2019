class Ten
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		Test t2 = new Test();
		t1.value = 1200;
		t2.value = 2300;
		System.out.println("\n t1 value : " + t1.value );
		System.out.println("\n t2 value : " + t2.value );
	}
}
class Test
{
	int value;
}