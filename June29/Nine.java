class Nine
{
	public static void main(String[] args)
	{
		int num = 745; //   1011101001
		int result;
		result = num << 2; // 101110100100 = 2980
		System.out.println("\n Result : " + result );
		result = num >> 2; // 10111010  = 186
		System.out.println("\n Result : " + result );
		result = num >>> 2;// 10111010  = 186
		System.out.println("\n Result : " + result );
	}
}