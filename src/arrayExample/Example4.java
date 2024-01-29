package arrayExample;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) 
	{
		int size;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		
		size = sc.nextInt();
		
		int [] a = new int[size];

		for (int i= 0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
			
			if (a[i]%2==0)
			{
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}

}
