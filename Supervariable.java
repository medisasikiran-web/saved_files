class Parent
{
	String name="My Father";
}
class child extends Parent
{
	String name="Sasikiran";
	void display()
	{
		System.out.println("Name:"+super.name);
		System.out.println("Name:"+name);
	}
}
class Supervariable
{
	public static void main(String args[])
	{
		child c=new child();
		c.display();
	}
}
