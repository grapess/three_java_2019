class Ten
{
	public static void main(String[] args)
	{
		int num = -745; //   1011101001
		int result;
		result = num >> 2; 
		System.out.println("\n Result : " + result );
		result = num >>> 2;
		System.out.println("\n Result : " + result );
	}
}