package sc_class;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number:");
		
		int b = sc.nextInt();
		
//		int c = b;
//		a = b;
//		b = c;
//		System.out.print(a);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.print(b);

	}

}
