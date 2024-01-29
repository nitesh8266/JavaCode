package superKeyword;

class A
{
	String s = "Super-Class-Variable";
	public void m1()
	{
		System.out.println("This is a M1 method from class A");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("This is M1 Method from Child Class B");
	}
	
	public void m2()
	{
		String c = "Local-Variable-from-M2-Method";
		System.out.println("This is method M2 from class B");
		super.m1();
		System.out.println(super.s);
	}
}

public class Example1 
{
	public static void main(String[] args)
	{
		B b = new B();
		//b.m1();
		b.m2();
	}

}
