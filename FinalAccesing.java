final class Parent1
{
	int age;
	String name;
	
	Parent1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()	
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class FinalAccesing
{
	public static void main(String args[])
	{
		Parent1 p=new Parent1("Sasi",20);
			p.display();
	}
}

		
