class Eight
{
	public static void main(String[] args)
	{
		int num1 = 745; //   1011101001
		int num2 = 298; //   0100101010
		int result;
		result = num1 & num2;// 0000101000 = 40
		System.out.println("\n Result : " + result );
		result = num1 | num2; // 1111101011 = 1003
		System.out.println("\n Result : " + result );
		result = num1 ^ num2; // 1111000011 = 963
		System.out.println("\n Result : " + result );
	}
}