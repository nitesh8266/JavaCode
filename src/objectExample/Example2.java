package objectExample;

public class Example2 
{

	public static void main(String[] args) 
	{
		Example2 x = new Example2();
		System.out.println(x.hashCode());
		
		Example2 y = new Example2();
		System.out.println(y.hashCode());
		
		Example2 z = x;
		System.out.println(z.toString());
		System.out.println(x.toString());
		System.out.println(z.hashCode());
	}

}
