class ClassA
{
	public int a;
	private int b;
	int c; //default access modifier
	protected int d;
	private void methodA()
	{
		System.out.println(a);
	}


	public void methodB()
	{
		methodA();
		System.out.println(b);
	}

	public void methodC()
	{
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		ClassA obj = new ClassA();
		System.out.println(obj.b);
	}
}