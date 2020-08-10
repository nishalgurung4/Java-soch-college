class Shape
{
	public void init()
	{
		System.out.println("Initialization");
	} 

	public void draw()
	{

	}
}
class Circle extends Shape
{
	public void draw()
	{

	}
}
class Square extends Shape
{
	public void draw()
	{

	}
}
class ShapeDemo
{
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		circle.draw();
		
	}