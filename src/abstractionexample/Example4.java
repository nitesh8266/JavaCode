package abstractionexample;

abstract class Vehicles1
{
	abstract public void price();
	abstract public void noOfWheels();
	abstract public void model();
}

class Details1 extends Vehicles1
{
	 public void price()
	 {
		int vehiclePrice = 500;
		System.out.println(vehiclePrice); 
	 }
	public void noOfWheels()
	{
		int totalWheel = 4;
		System.out.println(totalWheel);
	}
	
	public void model()
	{
		String modelName = "Tata Punch";
		System.out.println(modelName);
	}	
}

public class Example4 
{
	public static void main(String[] args) 
	{
		Details1 a = new Details1();
		a.noOfWheels();
		a.price();
		a.model();
	}
}