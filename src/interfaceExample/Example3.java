package interfaceExample;

interface A
{
	void m1();
}

interface B
{
	void m2();
}

class C implements A, B
{
	@Override
	public void m2() 
	{
		System.out.println("This is Method M2");
	}

	@Override
	public void m1()
	{
		System.out.println("This is Method M1");
	}	
}
public class Example3
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.m1();
		c.m2();
	}
}
