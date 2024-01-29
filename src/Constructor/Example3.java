package Constructor;

import java.util.Scanner;

public class Example3 
{
	String book_name;
	int book_price;
	
	public Example3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Name: ");
		book_name = sc.next();
		
		System.out.print("Enter Book Price: ");
		book_price = sc.nextInt();	
	}
	
	public static void main(String[] args) 
	{
		Example3 a = new Example3();
		
		System.out.println(a.book_name);
		System.out.println(a.book_price);

	}

}
