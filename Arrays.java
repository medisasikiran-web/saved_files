class SingleArray
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println("Before sorting");
		for(inti=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
	}
}