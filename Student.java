class Student
{	String name;
	int age;
	int rollNo;
	Student()
	{
		System.out.println("RollNo:"+rollNo);
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("RollNo"+rollNo);
		System.out.println("Name"+name);
		System.out.println("Age"+age);
	}
	public static void main(String args[])
	{
		Student s=new Student();
		Student s1=new Student("sasi",20);
		s.display();
		s1.display();
	}
}