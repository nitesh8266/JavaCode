package methodOverriding;

class Parent
{
	String carColour = "White";
	public void car()
	{
		System.out.println(carColour);
	}
	
	String carCompany = "Audi";
	public  void carName()
	{
		System.out.println(carCompany);
	}
}

class Son extends Parent
{
	String  carColour = "Black";
	public void car()
	{
	System.out.println(carColour);
	}
	
	String carCompany = "Nexon";
	public  void carName()
	{
		System.out.println(carCompany);
	}
}

class Daughter extends Parent
{
	String  carColour = "Pink";
	public void car()
	{
	System.out.println(carColour);
	}
	
	String carCompany = "Punch";
	public  void carName()
	{
		System.out.println(carCompany);
	}
}

public class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("-------------Parent Car-----------");
		Parent a = new Parent();
		a.car();
		a.carName();
		
		System.out.println("-------------Son Car-----------");
		Son b = new Son();
		b.car();
		b.carName();
		
		System.out.println("-------------Daughter Car-----------");
		Daughter c = new Daughter();
		c.carName();
		c.car();
	}
}
