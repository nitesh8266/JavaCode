package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample

{
	public static void main(String[] args) 
	{
		List a= new ArrayList();
		a.add("Java");
		a.add(111);
		a.add(66.5f);
		a.add('A');
//		System.out.println("ArrayList collections: " +a);
		
		a.add("Java");
		Integer i = new Integer(100);
		a.add(i);
		a.add("Null");
//		System.out.println("After Adding Another Collections: " +a);
		
		a.remove("Null");
		
//		System.out.println(a);
		
//		System.out.println(a.get(5));
		
		a.set(1, 99);
//		System.out.println(a);
		
//		System.out.println(a.size());
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(100);
//		a1.add("String");
		a1.add(20);
//		System.out.println("Integer Array List: "+ a1);
		
		List<String> a2 = new ArrayList<String>();
		a2.add("String Value");
		a2.add("Value2");
		
// 		System.out.println("String Array List: "+a2);
		
		ArrayList<Object> a3 = new ArrayList<>();
		a3.add(a1);
		a3.add(a2);
		
		System.out.println(a3);
		
		
	}
}
