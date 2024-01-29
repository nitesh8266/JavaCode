package sc_class;

import java.util.Scanner;

public class Multiplication_Table 
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please Enter Number: ");
	
	int num = sc.nextInt();
	
	for (int i = 1; i<=10; i++)
	{
		int b = num*i;
		
		System.out.println(num+"*"+i+"= "+b);
	}
	}
}
