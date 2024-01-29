package inheritanceLearning;

class Engine
{
	String engineCapacity = "1199 cc";
	String maxPower = "86.63bhp@6000rpm";
	String maxTorque = "115Nm@3250+/-100rpm";
	
//	public void engineDetails()
//	{
//		System.out.println(engineCapacity);
//		System.out.println(maxPower);
//		System.out.println(maxTorque);
//	}
}
class Car
{
	Engine e = new Engine();
	String carName = "Punch";
	String carCompany = "Tata Motors";
	String mileage = "18.8 kmpl";
	String bodyType = "SUV";
	
	public void carDetails()
	{
		System.out.println(carName);
		System.out.println(carCompany);
		System.out.println(mileage);
		System.out.println(bodyType);	
	}
}
public class HasARelation 
{
	public static void main(String[] args) 
	{
		Car a = new Car();
		a.carDetails();
	}
}
