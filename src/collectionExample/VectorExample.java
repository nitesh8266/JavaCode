package collectionExample;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) 
	{
		Vector<Integer> a = new Vector<Integer>();
		
		for (int i= 1; i<=100; i++)
		{
			a.add(i);
		}
		
		Enumeration<Integer> b = a.elements();
		
		while(b.hasMoreElements())
		{
			System.out.println(b.nextElement());
		}

	}

}
