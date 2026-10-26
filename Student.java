class Student
{
	int marks;
	String name;
	int rollNo;
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Rollnumber:"+rollNo);
		System.out.println("Marks:"+marks);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.marks=30;
		s1.name="Sasi";
		s1.rollNo=25;
		s1.display();
		Student s2=new Student();
		s2.marks=35;
		s2.name="Sravan";
		s2.rollNo=45;
		s2=s1;
		s2.display();
	}
}