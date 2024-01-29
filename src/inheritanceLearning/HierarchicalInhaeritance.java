package inheritanceLearning;

class HierarchicalInhaeritance 
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

//Extending HierarchicalInhaeritance

class Deposit1 extends HierarchicalInhaeritance
{
	long depAmount = 2000;
	public void depositAmount()
	{
	System.out.println("Total Deposit Amount: "+ depAmount);
	availableBalance = availableBalance+depAmount;
	System.out.println("Total Available Amount after Deposit: "+ depAmount);
	}
}

//Again Extending HierarchicalInhaeritance
class Withdraw extends HierarchicalInhaeritance 
{
	long withAmount = 1300;
	
	public void withdrawAmount()
	{
		System.out.println("Total Withdrawel Amount: "+ withAmount);
		availableBalance = availableBalance - withAmount;
		System.out.println("Total Available Amount after Withdrawel: "+ availableBalance);
	}
}