package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class Example1 
{
	public static void main(String[] args) 
	{
		List a1 = new ArrayList();
		a1.add(123);
		a1.add("Nitesh1");
		a1.add("Nitesh2");
		a1.add("Nitesh3");
		a1.add(1234);
		//System.out.println(a1);
		
		a1.add(5, 3);
		System.out.println(a1);
		
//		List a2 = new ArrayList();
//		
//		for (int i = 0; i<=13; i++)
//		{
//			a2.add(i);
//		}
//		System.out.println(a2);
		
//		 boolean f = a1.addAll(a2);
//		
//		System.out.println(f);
	//	System.out.println(a1);
//		var c = a1.get(3);
//		System.out.println(c);
//		
//		a1.remove(5);
//		System.out.println(a1);
//		
//		a1.retainAll(a1);
//		System.out.println(a1);
		
//		a1.clear();
//		System.out.println(a1);
		
//		var d= a1.contains(6);
//		System.out.println(d);
		
//		boolean var = a1.containsAll(a2);
//		System.out.println(var);
		
//		var e = a1.isEmpty();
//		System.out.println(e);
		
//		System.out.println(a1.size());	
		
	//System.out.println(a1.get(3));
	
//	System.out.println(a1.indexOf(1234));
		a1.set(3, "Hello");
		
		System.out.println(a1);
		
		System.out.println(a1.lastIndexOf(3));
		
	}
}
