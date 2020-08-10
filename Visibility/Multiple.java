class Parent1
{
	protected int a;

	protected void display1()
	{
		System.out.println("Display1");
	}

	protected void display2()
	{
		System.out.println("Display2");
	}

	protected void display3()
	{
		System.out.println("Display3");
	}

}


class Child extends Parent1
{
	public void display()
	{
		a = 5;
		System.out.println(a);
	}

	//method overriding
	public void display1()
	{
		System.out.println("Child ko display1");
	}

	public static void main(String[] args)
	{
		Child obj = new Child();
		obj.display();
		obj.display1();

	}
}

