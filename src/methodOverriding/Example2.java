package methodOverriding;

class Parent1
{
	public void gold()
	{
		System.out.println("100GM");
	}
	
	public void merriege()
	{
		System.out.println("Merriege with Madhu");
	}
}

class Son1 extends Parent1
{
	public void gold()
	{
		System.out.println("200GM");
	}
	
	public void merriege()
	{
		System.out.println("Merriege with Gullu");
	}
}
public class Example2 
{
	public static void main(String[] args) 
	{
		System.out.println("--------Parent Merriege-----------");
		Parent1 d = new Parent1();
		d.gold();
		d.merriege();
		
		System.out.println("--------Son Merriege-----------");
		Son1 e = new Son1();
		e.gold();
		e.merriege();
	}

}
