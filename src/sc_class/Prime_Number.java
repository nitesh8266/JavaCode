package sc_class;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		
		int num = sc.nextInt();
		
		boolean flag = true;
		for (int i = 2; i<num/2; i++)
		{
			if (num%i==0)
			{
				flag = false;
				break;
			}
		}
		if (flag==true)
		{
			System.out.print("Given number is Prime Number");
		}
		else
		{
			System.out.print("Given number is not a Prime Number");
		}
	}

}
