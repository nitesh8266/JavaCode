package inheritanceLearning;

public class HierarchicalDisplay 
{
	public static void main(String[] args) 
	{	
		Deposit1 a = new Deposit1();
		a.details();
		a.depositAmount();
		
		Withdraw b = new Withdraw();
		b.details();
		b.withdrawAmount();
	}

}
