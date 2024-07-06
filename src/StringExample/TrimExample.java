package StringExample;

public class TrimExample
{
	public static void main(String[] args)
	{
//		It removes white spaces from starting and ending of string
//		trim() will not remove spaces from middle 
		
		String s = "  Welcome  ";
		
		System.out.println("Before Trim: "+ s);
		
		System.out.println("After Trim: " +s.trim());
		
	}

}
