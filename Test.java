interface Interface1
{
	int a=10;
	void display();
}
class InterfaceDemo1 implements Interface1
{
	public void display()
	{
		System.out.println("I am from interface class");
	}
}
class Test
{
	public static void main(String args[])
	{
		InterfaceDemo1 i=new InterfaceDemo1();
		i.display();
	}
}
