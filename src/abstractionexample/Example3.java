package abstractionexample;

abstract class Calculator1
{
	 abstract public void addition(int a,int b);
	 abstract public void substraction(int a,int b);
	 abstract public void division(int a,int b);
	 abstract public void multiplication(int a,int b); 
}

abstract class Calculation1 extends Calculator1
{
	  public void addition(int a,int b)
	  {
		  int c = a+b;
		  System.out.println("Addition: " + c);
	  }
	  public void substraction(int a,int b)
	  {
		  int c = a-b;
		  System.out.println("Substraction: " + c);
	  }
	  public void division(int a,int b)
	  {
		  int c = a/b;
		  System.out.println("Division: " + c);
	  }
	  public void multiplication(int a,int b)
	  {
		  int c = a*b;
		  System.out.println("Multiplication: " + c);
	  }
}

class View extends Calculation1
{
	public void details()
	{
		addition(30, 40);
		substraction(100, 40);
		division(50, 10);
		multiplication(5, 10);
	}
}

public class Example3 
{
	public static void main(String[] args) 
	{
		View v = new View();
		v.details();
	}
}
