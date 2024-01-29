//Using Generalization + Up casting + Method overriding, we can Achieve RunTime Polymorphism.

package generalisationExample;

class Animal1
{
	public void eat() 
	{
		System.out.println("Animal Eats");
	}
	
	public void makeSound()
	{
		System.out.println("Make Different Sound");
	}	
}

class Dogs extends Animal1
{
	public void eat() 
	{
		System.out.println("Dogs Eat biscuits");
	}
	
	public void makeSound()
	{
		System.out.println("Dogs Barks");
	}
}

public class CombinationOfGUMO 
{
	public static void main(String[] args) 
	{
		animalDetails(new Dogs());
		animalDetails(new Animal1());
	}

	public static void animalDetails(Animal1 a)
	{
		if (a instanceof Dogs)
		{
			Dogs d = (Dogs)a;
			d.eat();
			d.makeSound();
		}
		else
		{
			a.eat();
			a.makeSound();
		}
	}
}
