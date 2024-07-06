package StringExample;

public class EqualsIgnoreCaseExample 
{
	public static void main(String[] args) 
	{
//		Compares two strings based on string data without considering case sensitivity
		
		String s = "Welcome";
		String s1 = "Welcome";
		String s2 = "WELCOME";
		
		System.out.println(s.equalsIgnoreCase(s1)); // True
		
		System.out.println(s.equalsIgnoreCase(s2));	// True
		
//	   Check whether the given string is pallindrome or not.
		
		String a = "Madam";
		String rev = "";
		
		for(int i = a.length()-1; i>=0; i--)
		{
			rev = rev+a.charAt(i);
		}
		System.out.println("Reverse String is: " + rev);
		
		if(rev.equalsIgnoreCase(a))	
		{
			System.out.println("Given String is Pallindrome");
		}
		else
		{
			System.out.println("Given String is not Pallindrome");	
		}
	}
}
