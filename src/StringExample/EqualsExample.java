package StringExample;

public class EqualsExample {

	public static void main(String[] args) 
	{
//		It checks whether two strings are same or not, i.e it compars two strings based on string data 
		
		String s = "Welcome";
		String s1 = "Welcome";
		String s2 = "WELCOME";
		
		System.out.println(s.equals(s1)); // True
		
		System.out.println(s.equals(s2));
//		False because equals method consider case sensitivity 
		
	}
}
