package inheritanceLearning;

class SingleLevel 
{
	int accNumber = 123;
	String accName = "Nitesh";
	long availableBalance = 2500;
	
	public void details() 
	{
		System.out.println("Customer Name: " + accName);
		System.out.println("Customer Number: " + accNumber);
		System.out.println("Customer Account Opening amount: " + availableBalance);
	}
}
	class Deposit extends SingleLevel
	{
		long depAmount = 2000;
		
		public void depositAmount()
		{
			System.out.println("Deposite Amount: "+ depAmount);
			availableBalance = availableBalance + depAmount;
			System.out.println("Total Available balance after deposit: " + availableBalance);
		}
	}
	
	
