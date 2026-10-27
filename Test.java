interface RBI
{
	void display();
}
class UnionBank implements RBI
{
	String statement;
	String accountNo;

	public void display()
	{
		System.out.println("Statement"+statement);
		System.out.println("AccountNo"+accountNo);
	}
}
class Test
{
	public static void main(String args[])
	{
		UnionBank b=new UnionBank();
		b.statement="Aprroved Succesfully";
		b.accountNo="003310100151824";
		b.display();
	}
}
