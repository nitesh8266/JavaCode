package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0; i<=100; i++)
		{
			a.add(i);
		}
//		System.out.println(a);
		
		Iterator<Integer> itr = a.iterator();
		
		while(itr.hasNext())
		{
			Integer b = itr.next();
			
			if (b%2==0)
			{
				System.out.println(b);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(a);
	}

}
