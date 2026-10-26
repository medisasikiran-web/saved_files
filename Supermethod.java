class parent
{
	String name="Sasi";
	String branch="CSD";
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
	}
}
class Child extends parent
{
	String name="Muni";
	String branch="AIDS";
	void display()
	{
		
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		super.display();
	}
}
class Supermethod
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.display();
	}
}
	