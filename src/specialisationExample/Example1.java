package specialisationExample;

interface Animal
{
	public void eat();
	public void makeSound();
}

class Dog implements Animal
{
	@Override
	public void eat() 
	{
		System.out.println("Dogs Eat Biskut");
	}

	@Override
	public void makeSound() 
	{
		System.out.println("Dogs Make Sound: Bow");
	}
}

class Cat implements Animal
{
	@Override
	public void eat() 
	{
		System.out.println("Cat eats Rat");
	}

	@Override
	public void makeSound() 
	{
		System.out.println("Cat make sound: Miyau");	
	}	
}

public class Example1 
{
	public static void main(String[] args) 
	{
		dogDetails (new Dog());
		catDetails (new Cat());
	}

	public static void catDetails(Cat c) 
	{
		c.eat();
		c.makeSound();
	}

	public static void dogDetails(Dog d) 
	{
		d.eat();
		d.makeSound();
	}
}
