package arrayExample;

import java.util.Scanner;

public class Example5 
{
	public static void main(String[] args) 
	{
		int size;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		
		size = sc.nextInt();
		
		int [] a = new int[size];

		int maxNumber = a[0];
		for (int i= 0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
			
			if (a[i]>maxNumber)
			{
				maxNumber = a[i];
			}
		}
		System.out.println(maxNumber);
	}
} 
