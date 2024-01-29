package abstractionexample;

abstract class Vehicles
{
	abstract public void price();
	abstract public void noOfWheels();
}

class Details extends Vehicles
{
	 public void price()
	 {
		int vehiclePrice = 500;
		System.out.println(vehiclePrice); 
	 }
	public void noOfWheels()
	{
		int totalWheel = 2;
		System.out.println(totalWheel);
	}
	
}

public class Example1 
{
	public static void main(String[] args) 
	{
		Details a = new Details();
		a.noOfWheels();
		a.price();

	}

}
