package abstractionexample;

abstract class Calculator
{
	 abstract public void addition(int a,int b);
	 abstract public void substraction(int a,int b);
	 abstract public void division(int a,int b);
	 abstract public void multiplication(int a,int b); 
}

class Calculation extends Calculator
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

public class Example2 
{
	public static void main(String[] args) 
	{
		Calculation x = new Calculation();
		x.addition(30, 40);
		x.substraction(100, 40);
		x.division(50, 10);
		x.multiplication(5, 10);
	}

}
