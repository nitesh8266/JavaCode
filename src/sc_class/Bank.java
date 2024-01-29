package sc_class;

public class Bank 
{
	int accNumber = 123;
	String accName = "Nitesh";
	long availableBalance = 2500;
	
	public void  accInfo()
	{
		System.out.println("Customer Name: " + accName);
		System.out.println("Customer Number: " + accNumber);
		System.out.println("Customer Account Opening amount: " + availableBalance);
		
	}
}	
	class Deposite extends Bank
	{
		long depAmmount = 5000;
		
		public void ammDeposite()
		{
			System.out.println("Customer Deposite amount: "+ depAmmount);
			availableBalance = availableBalance + depAmmount;
			System.out.println("Total Available Balance: " + availableBalance);
		}
	}
	class AmmWithdraw extends Deposite
	{
		long nikala = 3000;
		public void withdrawBalaance()
		{
			System.out.println("Withdraw: "+ nikala);
			availableBalance = availableBalance - nikala;
			System.out.println("Total amount after withdraw: " +availableBalance);
		}
	}
