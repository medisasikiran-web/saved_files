abstract class Shape
{
	abstract void area();
	void display()
	{
		Systemout.println("This is a shape:");
	}
}
class circle extends Shape
{
	void area()
	{
		int r=5;
		System.out.println("Area of circle:"+(3.14*r*r));
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.area();
		c.display();
	}
}		