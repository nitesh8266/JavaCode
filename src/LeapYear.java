
public class LeapYear {

	public static void main(String[] args) {
	
		//2029 and 2000 is leap Year
		
		int a = 2020;
		
		if (a%4 == 0 && a%100 != 0 || a%400 == 0) 
		{
			System.out.println("Leap Year");
		}
		else 
		{
			System.out.println("Normal Year");
			
		}
			

	}

}
