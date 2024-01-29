package Constructor;

import java.util.Scanner;

public class Example4 
{
	String car_name;
	long car_price;
	String car_colour;
	String car_company;
	String car_type;
	
	public Example4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Car Name: ");
		car_name = sc.next();
		
		System.out.print("Enter Car Price: ");
		car_price = sc.nextLong();
		
		System.out.print("Enter Car Colour: ");
		car_colour = sc.next();
		
		System.out.println("Enter Car Company: ");
		car_company = sc.next();
		
		System.out.println("Enter Car Type: ");
		car_type = sc.next();
	}
	
	public static void main(String[] args)
	{
		Example4 a = new Example4();
		
		System.out.println(a.car_name);
		System.out.println(a.car_price);
		System.out.println(a.car_colour);
		System.out.println(a.car_company);
		System.out.println(a.car_type);		
	}
}
