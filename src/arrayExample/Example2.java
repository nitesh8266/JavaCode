package arrayExample;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args)
	{
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		
		size = sc.nextInt();
		
		int [] b = new int[size];
		
		for (int i=0; i<b.length; i++)
		{
			b[i]  = sc.nextInt();
						
		}
		
		System.out.println(b[3]);
	}
}
