package arrayExample;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
			int size;
			int sum = 0;
			int avg;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Size: ");
			
			size = sc.nextInt();
			
			int [] a = new int[size];

			for (int i= 0; i<a.length; i++)
			{
				a[i] = sc.nextInt();
				sum = sum + a[i];
			}
			System.out.println(sum);
			
			avg = sum/a.length;
			System.out.println(avg);
	}
}
