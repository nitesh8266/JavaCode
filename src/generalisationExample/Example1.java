package generalisationExample;

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

class Monkey implements Animal
{
	@Override
	public void eat() 
	{
		System.out.println("Monkey Eats Banana");
	}

	@Override
	public void makeSound() 
	{
		System.out.println("Monkey Make Sound Kheu");
	}
}
public class Example1 
{
	public static void main(String[] args) 
	{
		animalDetails(new Dog ());
		animalDetails(new Cat ());
		animalDetails(new Monkey ());
	}

	public static void animalDetails(Animal a) 
	{
		a.eat();
		a.makeSound();
	}
}

