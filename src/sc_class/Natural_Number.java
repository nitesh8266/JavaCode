package sc_class;

import java.util.Scanner;

public class Natural_Number {

	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter limit of Natural number: ");
		
		int num = sc.nextInt();
		
		for (int i = 1; i<=num; i++)
		{
			sum = sum+i;
		}
		System.out.println("Total sum is: " + sum);
		
		int prod = 1;
		for (int j = 1; j<=num; j++)
		{
			prod = prod*j;
		}
		
		System.out.println("Product is: "+prod);
		
	}

}
