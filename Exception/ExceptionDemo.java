class ExceptionDemo
{
	static public int methodA()
	{
		int a = 5;
		System.out.println("Come Come");
		try {
			System.out.println(a/1);
		}
		catch(Exception e){
			System.out.println("Exception vitra");
			return 0;
		}
		finally {
		System.out.println("Bye Bye");
		}
		return 0;

	}
	public static void main(String[] args)
	{
		methodA();
	}
}