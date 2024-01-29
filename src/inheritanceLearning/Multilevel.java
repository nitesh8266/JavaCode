package inheritanceLearning;

class Multilevel
{
	static String carName = "Punch";
	String carCompany = "Tata Motors";
	String carType = "SUV";
	long carPriceBaseVarient = 25000;
	
	public static void carDetails()
	{
		Multilevel a = new Multilevel();
		System.out.println("Car Name: " + carName);
		System.out.println("Car Company: " + a.carCompany);
		System.out.println("Car Type: " + a.carType);
		System.out.println("Car Price Base Varient: " + a.carPriceBaseVarient);
	}
}

 class PunchAdventure extends Multilevel
 {
	long  punchAdventurePrice = 30000;
	
	public void PunchAdventurePriceDifference()
	{
		System.out.println("Punch Adventure Price: " + punchAdventurePrice);
		long priceDifference = punchAdventurePrice - carPriceBaseVarient;
		System.out.println("Price Difference between Base Varient and punch Adventure is: "+priceDifference);
	}
 }
 
 class PunchAccomplished extends PunchAdventure
 {
	 long punchAccomplishedPrice = 37000;
	 public void PunchAccomplishedPriceDifference()
	 {
		 System.out.println("Punch Accomplished Price: " + punchAccomplishedPrice); 
		 long priceDifferenceAccomplished = punchAccomplishedPrice - punchAdventurePrice;
		 System.out.println("Price Difference between Punch Adventure and PunchAccomplished is: "+priceDifferenceAccomplished);
	 }
 }
 