package objectExample;

//public class Example1 extends Object
public class Example1 
{

	public static void main(String[] args) 
	{
		Example1 a = new Example1();
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		
		Example1 b = new Example1();
		System.out.println(b.toString());
		System.out.println(b.hashCode());
		
		Example1 c = a;
		System.out.println(c.toString());
		System.out.println(c.hashCode());
		
		System.out.println(a); //a.toString()
		System.out.println(b);
		System.out.println(c);
		
	}
}
