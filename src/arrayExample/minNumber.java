package arrayExample;

import java.util.Scanner;

public class minNumber 
{
	public static void main(String[] args)
	{
		int size;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		
		size = sc.nextInt();
		
		int [] a = new int[size];
		
		for (int i= 0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		int minNum = a[0];
		for (int j = 0; j<a.length; j++)
		{
		if (a[j]<minNum)
		{
			minNum  = a[j];
		}
	}
	System.out.println(minNum);
	}
}
