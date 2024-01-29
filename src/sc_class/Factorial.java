package sc_class;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int fact  = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Factorial Number: ");
		
		int num = sc.nextInt();
		
		for (int i = num; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.print(fact);
	}

}
