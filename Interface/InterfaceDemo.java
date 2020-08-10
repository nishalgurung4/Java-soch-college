interface Mailable
{
	final int a = 4;
	 void sendMail();


}

interface Logable
{
	public void log();

	default public void test()
	{

	}
}

class Person
{

}

class User extends Person implements Mailable, Logable
{
	public void sendMail()
	{
		System.out.println("Sending");

	}

	public void log()
	{

	}


}

class InterfaceDemo
{
	public static void main(String[] args)
	{
	}
}