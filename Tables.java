class Tables extends Thread
{
	int age;
	String name;
	int rollNo;
	public void run1()
	{
		
		for(int i=1;i<=10;i++)
		{
			try
				{
					Thread.sleep(3000);
				}
				catch(InterruptedException e) 
				{
				System.out.println(e);
				}		
			for(int j=1;j<=10;j++)
			{
				System.out.println(i*j);
					
			}
		}
	}
	public static void main(String args[])
	{
		int a[]=new int[3];
		a[]={1,2,3};
		Tables t=new Tables();
		t.start();
		t.age=20;
		t.name="Sasi";
		t.rollno=3;
		System.out.println("Age"+t.age);
		System.out.println("Name"+t.name);
		System.out.println("RollNumber"+t.rollNo);
		for(int i=0;i<length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
