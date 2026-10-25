class UserThread extends Thread 
{
	public void method1()
	{
		System.out.println("I am from Thread class");
	}
	public void method2()
	{
		System.out.println("I am from Thread class1");
	
	}
	public void method3()
	{
		System.out.println("I am from Thread class 2");
	}
	public void run()
	{
		method1();
		method2();
		method3();
	}
}
class UserThreadDemo
{
	public static void main(String args[])
	{
		UserThread t=new UserThread();
		t.start();
	}
}