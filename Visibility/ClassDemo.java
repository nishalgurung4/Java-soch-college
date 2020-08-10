class ClassDemo
{
	public static void main(String[] args)
	{
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		obj.methodA();
		obj.methodB();

		ClassB obj2 = new ClassB();
		obj2.methodB();

	}
}