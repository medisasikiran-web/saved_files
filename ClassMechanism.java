class ClassMechanism
{
	int rollNo;
	String name;
	ClassMechanism(int r,String n)
	{
		this.name=n;
		this.rollNo=r;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Rollnumber:"+rollNo);
	}
	public static void main(String args[])
	{
		ClassMechanism s=new ClassMechanism(3,"sasi");
		s.display();
	}
}