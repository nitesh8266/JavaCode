//WAP to count all numbers present between 1 to 30 which are divisible by 5

package sc_class;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int num = sc.nextInt();
		
		for (int i = 1; i<=num; i++)
		{
			if (i%5==0)
			{
			count++;	
			}
		}
		System.out.println(count);
	}

}
