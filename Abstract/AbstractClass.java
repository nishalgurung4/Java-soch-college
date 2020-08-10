abstract class Shape
{
	
	public void init()
	{
		System.out.println("Initialization");
	} 

	abstract public void draw();

	abstract public void paint();
}

abstract class Circle extends Shape
{
	public void draw()
	{

	}
}

class ShapeDemo
{
	public static void main(String[] args)
	{
		// Circle circle = new Circle();

	}
}