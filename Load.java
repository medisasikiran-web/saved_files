class Load
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		Load l=new Load();
		System.out.println(l.add(2,3));
		System.out.println(l.add(2.3,4.2));
	}
}
			