package StringExample;

public class CharAtExample 
{

	public static void main(String[] args)
	{
//		It provides character at given index
//		Index will always start from 0
		
		String s = "Welcome";
		
		System.out.println(s.charAt(5)); // m

// 		If we provide invalid index as arguments for charAt() we will get StringIndexOutOfBoundException
//		System.out.println(s.charAt(9));
		
// 		Count of e and m
		
//		int count = 0;
//		
//		for (int i= 0; i<s.length(); i++)
//		{
//			if (s.charAt(i) == 'e' || s.charAt(i) =='m')
//			{
//				count = count+1;
//			}
//		}
//		System.out.println(count);	// 3
		
//		Reverse of String
		
		System.out.println("Actual String is: "+ s);
		String rev = "";
		
		for (int i = s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse of String is: " + rev);
	}
}
