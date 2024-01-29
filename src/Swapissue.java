
public class Swapissue {

	public static void main(String[] args) 
	{
		
		int a = 5;
		int b = 7;
		
		// With Temp variable
	 //  int  temp = b;
	 //  b  =  a;
	//  a  = temp;
	  
		//Without Temp variable
		a = a-b;
		b = a+b;
		a = b-a;
		
	  System.out.print(b);
	}

}
