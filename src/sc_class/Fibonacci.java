package sc_class;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Upper Limit number: ");
		
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i<num; i++)
		{
			int c = a+b;
			
			System.out.print(" "+a);
			a = b;
			b = c;
		}
	}

}
