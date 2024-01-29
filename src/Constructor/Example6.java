package Constructor;

public class Example6 
{
	String car_name;
	long car_price;
	String car_colour;
	String car_company;
	String car_type;
	
	public Example6(String car_name, long car_price, String car_colour, String car_company, String car_type)
	{
		this.car_name = car_name;
		this.car_price = car_price;
		this.car_colour = car_colour;
		this.car_company = car_company;
		this.car_type = car_type;
	}
	public static void main(String[] args) 
	{
		Example6 a = new Example6("Tata Punch", 9999999, "Black", "Tata Motors", "Micro SUV");
		a.carDetails();
		
		System.out.println("-------------------------------------------------------------");
		Example6 b = new Example6("Tata Nexon", 1300000, "White", "Tata Motors", "SUV");
		b.carDetails();
	}
	private void carDetails() 
	{
		System.out.println(car_name);
		System.out.println(car_price);
		System.out.println(car_colour);
		System.out.println(car_company);
		System.out.println(car_type);	
	}

}
