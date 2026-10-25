class Animal
{
	void sound()
	{
		System.out.println("Animal makes a Sound:");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog barks:");
	}
}
class Lion extends Animal
{
	void sound()
	{
		System.out.println("Lion roars:");
	}
}
class AnimalTest
{
	public static void main(String args[])
	{
		Animal a;
		a=new Dog();
		a.sound();
		a=new Lion();
		a.sound();
	}
}	