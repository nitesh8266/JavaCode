package Constructor;

public class ConstructorOverloading 
{
	public ConstructorOverloading()
	{
		this("Punch","SUV", 99999999);
	}
	public ConstructorOverloading(String carName, String carModel, long carPrice)
	{
		this("Tata Motors", 88888888);
		System.out.println(carName);
		System.out.println(carModel);
		System.out.println(carPrice);
	}
	public ConstructorOverloading(String carModel, long carPrice)
	{
		System.out.println(carModel);
		System.out.println(carPrice);
		System.out.println("-------------------------------------------");
	}
	public static void main(String[] args) 
	{
		ConstructorOverloading a = new ConstructorOverloading();	
	}
}
