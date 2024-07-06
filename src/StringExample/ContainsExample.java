package StringExample;

public class ContainsExample 
{
	public static void main(String[] args) 
	{
//		Checks whether string is present in given string or not 
//		Return True/False
		
		String s= "Welcome to the Home";
		
		System.out.println(s.contains("to"));
		
		System.out.println(s.contains("TO")); //False - Case Sensitive
		
		System.out.println(s.toUpperCase().contains("TO"));
	}
}
