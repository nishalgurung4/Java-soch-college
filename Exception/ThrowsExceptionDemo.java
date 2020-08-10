import java.io.*;
class ThrowsExceptionDemo
{
	static public void method1() throws IOException
	{
		throw new IOException("IO Exception");
	}

	public static void main(String[] args) throws IOException
	{
		// try {
			method1();
		// }
		// catch(IOException e)
		// {
		// 	System.out.println("Exception");
		// }
	}
}