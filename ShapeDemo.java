abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	double r=5;
	void area()
	{
		System.out.println("Area of circle="+(Math.PI*r*r));
	}
}
class Rectangle extends Shape
{
	double  l=5, b=2;
	void area()
	{
		System.out.println("Area of Rectangle="+(l*b));
	}
}
class ShapeDemo
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.area();
		Rectangle r=new Rectangle();
		r.area();
	}
}