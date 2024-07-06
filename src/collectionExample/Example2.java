package collectionExample;

import java.util.ArrayList;

public class Example2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i = 1; i<=100; i++)
		{
			a.add(i);
		}
		
		System.out.println(a);
	}

}
