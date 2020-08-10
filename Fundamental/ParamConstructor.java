class ParamConstructor
{
	int a,b;
	//parameterized constructor
	public ParamConstructor(int a, int b)
	{
		this.a = a;
		this.b = b;

	}
	//default constructor
	public ParamConstructor()
	{
		a = 0;
		b = 0;
	}
}

class ParamDemo
{
	public static void main(String[] args)
	{

		ParamConstructor p = new ParamConstructor(10, 20);
		System.out.println(p.a);
		System.out.println(p.b);
	}
}