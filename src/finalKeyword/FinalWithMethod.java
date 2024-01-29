package finalKeyword;

//if a method is declared as final we cannot override it.
//final keyword says that do not make further changes and in overriding we are changing the implementation. Therefore, final methods cannot be overridden. 

class Flipkart
{
	public final void logo()
	{
		System.out.println("Flipkart Logo");
	}
}

class Myntra extends Flipkart
{
//	public final void logo()
//	{
//		System.out.println("Flipkart Logo");
//	}
}

public class FinalWithMethod 
{
	public static void main(String[] args) 
	{

	}

}
