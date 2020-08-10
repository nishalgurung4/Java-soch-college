class Circle
{
	public double radius;
	//constructor overloading
	//default constructor
	public Circle()
	{
		this.radius = 1;
	}
	// parameterized constructor
	public Circle(double radius)
	{
		this.radius = radius;
	}

	//parameterized constructor with object as param
	//but sometime also known as copy constructor
	public Circle(Circle circle)
	{
		this.radius = circle.radius;
	}

	public double calculateArea()
	{
		return 3.14*radius*radius;
	}

	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		System.out.println("Area of circle is "+c1.calculateArea());
		Circle c2 = new Circle(2);
		System.out.println("Area of circle is "+c2.calculateArea());
		Circle c3 = new Circle(c2);
		System.out.println("Area of circle is "+c3   .calculateArea());

	}
}