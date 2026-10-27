import java.util.Scanner;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			
		}
		System.out.println("The array of single dimension:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	}
}