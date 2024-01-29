package Constructor;

public class Example1 
{
	public String name;

	public static void main(String[] args)
	{
		Example1 s = new Example1();
		s.name = "Nitesh";
		System.out.println(s.name);

		Example1 b = new Example1();
		System.out.println(b.name);
	}

}
