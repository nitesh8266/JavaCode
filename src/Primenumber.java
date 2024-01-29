
public class Primenumber 
{

	public static void main(String[] args) 
	{
			   int a= 20;
			  
			  boolean b = true;
			  
			  for (int i=2; i<a; i++) 
			  { 
					 if (a%i==0)
						{
						 b = false;
						 break;
						}
			  }
					 if (b==true) {
						 System.out.print("Prime number"); 
					 }
					 else {
						 System.out.print("Not Prime number"); 
					 }
	}
}