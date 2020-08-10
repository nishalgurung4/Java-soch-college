class A
{
	int i;
	int j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
}

class B extends A
{
	
	int i;

	B(int a, int b)
	{
		super(a, b);
		super.i = a;
		i = b;
	}

	public void show()
	{
		System.out.println("i in super class="+super.i);
		System.out.println("j in super class="+super.j);
		System.out.println("i in subclass="+i);

	}
}

class UserSuper
{
	public static void main(String[] args)
	{
		B b = new B(1,5);
		b.show();
	}
}