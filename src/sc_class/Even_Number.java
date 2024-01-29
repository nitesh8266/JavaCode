//WAP to print all even numbers from 1 to 30

package sc_class;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number: ");
	
	int num = sc.nextInt();
	
		for (int i = 1; i<=num; i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
