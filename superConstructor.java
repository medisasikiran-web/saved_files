class parent
{
	String name;
	String branch;
	parent(String n,String b)
	{
		this.name=n;
		this.branch=b;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
	}
}
class Child extends parent
{
	String name;
	String branch;
	Child(String n,String b)
	{
		super(n,b);	
		this.name=n;
		this.branch=b;
	}

	void display()
	{
		
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		
	}
}
class SuperConstructor
{
	public static void main(String args[])
	{
		Child c=new Child("Sasi","CSD");
		c.display();
	}
}
	