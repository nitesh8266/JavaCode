package Constructor;

public class Example5 
{
	String dog_Name;
	String dog_colour;
	
	public Example5 (String dog_name1, String dog_colour1)
	{
		dog_Name = dog_name1;
		dog_colour = dog_colour1;		
	}
	
	public static void main(String[] args) 
	{
		Example5 a = new Example5("Street Dog", "Black");
		a.displayDetails();
				
//			System.out.println(a.dog_Name);
//			System.out.println(a.dog_colour);
			
			Example5 b = new Example5("House Dog", "Red");
			b.displayDetails();
//			System.out.println(b.dog_Name);
//			System.out.println(b.dog_colour);
	}
	private void displayDetails()
	{
		System.out.println(dog_Name);
		System.out.println(dog_colour);		
	}
}
