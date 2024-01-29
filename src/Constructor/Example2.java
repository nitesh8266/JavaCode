package Constructor;

public class Example2 
{
	String name;
	
	public Example2()
	{
		name = "Nitesh";
	}
	public static void main(String[] args) 
	{
		Example2 a = new Example2();
		System.out.println(a.name);
		
		Example2 b = new Example2();
		System.out.println(b.name);
	}

}
