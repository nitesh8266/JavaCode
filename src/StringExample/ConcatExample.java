package StringExample;

public class ConcatExample 
{
	public static void main(String[] args) 
	{
//		Concatenates string in end of called string
//		Joining String
		
		String s = "Welcome";
		String s1 = "to";
		String s2 = "the";
		String s3 = "Home";
		
		System.out.println(s.concat(s1));
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s.concat(s1)+ " ".concat(s2)+ " ".concat(s3));
	}
}
