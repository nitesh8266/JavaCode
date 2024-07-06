package StringExample;

import java.util.Arrays;

public class SplitExample 
{
	public static void main(String[] args) 
	{
//		It converts or breaks the string into an array depending on argument
		
		String s = "nitesh@gmail.com";
		
		String[] s1 = s.split("@");
		
		System.out.println(s1[0]);
		
		System.out.println(Arrays.toString(s1));

		String ch[] = s.split(" ");
		System.out.println(ch[0]);
		System.out.println(ch[1]);	

	}
}
