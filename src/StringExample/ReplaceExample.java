package StringExample;

public class ReplaceExample 
{
	public static void main(String[] args) 
	{
//		Replaces all occurrences given character/sequence of character/string with replacement character/string respectively 

		String s = "Welcome to the Home";
		
		System.out.println(s.replace('e', 'h'));
		
		System.out.println(s.replaceAll(s, "New String Value"));
		
		System.out.println(s.replaceAll("Welcome", "Good"));
		
		System.out.println(s.replaceFirst("to", "Good"));
	}
}
