package superKeyword;

class A1
{
	int a = 100;
	public void x()
	{
		System.out.println("This is a X method from Super Class A1");
	}
}

class B1 extends A1
{
	public void x()
	{
		System.out.println("This is x Method from Child Class B1");
	}
	
	public void y()
	{
		int a = 200;
		System.out.println("This is Y method from child class B1");
		super.x();
		System.out.println(super.a);
	}
}

	class C extends B1
	{
	public void z()
	{
		super.x();
	}
}
public class Example2 
{
	public static void main(String[] args) 
	{
		B1 b1 = new B1();
		b1.y();
		
		C c = new C();
		c.z();
	}
}
