package interfaceExample;

interface RBI
{
	void deposite();
	void withdrawls();
	void aadharLink();
	void minBal();
	void kyc();	
}
	abstract class SBI implements RBI
	{
		@Override
		public void deposite()
		{
			System.out.println("Deposite money in SBI Bank");
		}
		@Override
		public void withdrawls()
		{
			System.out.println("Withdraw money in SBI Bank");
		}
		@Override
		public void aadharLink()
		{
			System.out.println("Addhar link in SBI Bank");
		}
	}
	
	class SBH extends SBI
	{
		@Override
		public void minBal()
		{
			System.out.println("Manage Minimum Balance in SBI");		
		}
		@Override
		public void kyc() 
		{
			System.out.println("Update KYC IN SBI");		
		}	
	}
	class ICICI implements RBI
	{
		@Override
		public void deposite() 
		{
			System.out.println("Deposite money in ICICI Bank");
		}
		@Override
		public void withdrawls() 
		{
			System.out.println("Withdraw money in ICICI Bank");	
		}
		@Override
		public void aadharLink() 
		{
			System.out.println("Addhar link in ICICI Bank");	
		}
		@Override
		public void minBal() 
		{
			System.out.println("Manage Minimum Balance in ICICI");
		}

		@Override
		public void kyc() 
		{
			System.out.println("Update KYC in ICICI");		
		}		
	}
	
	class PNB implements RBI
	{
		@Override
		public void deposite() 
		{
			System.out.println("Deposite money in PNB Bank");
		}

		@Override
		public void withdrawls() 
		{
			System.out.println("Withdraw money in PNB Bank");	
		}

		@Override
		public void aadharLink() 
		{
			System.out.println("Addhar link in PNB Bank");	
		}

		@Override
		public void minBal() 
		{
			System.out.println("Manage Minimum Balance in PNB Bank");
		}

		@Override
		public void kyc() 
		{
			System.out.println("Update KYC in PNB");			
		}	
	}
	
	class HDFC implements RBI
	{
		@Override
		public void deposite() 
		{
			System.out.println("Deposite money in HDFC Bank");
		}

		@Override
		public void withdrawls() 
		{
			System.out.println("Withdraw money in HDFC Bank");	
		}

		@Override
		public void aadharLink() 
		{
			System.out.println("Addhar link in HDFC Bank");	
		}

		@Override
		public void minBal() 
		{
			System.out.println("Manage Minimum Balance in HDFC Bank");
		}

		@Override
		public void kyc() 
		{
			System.out.println("Update KYC in HDFC");	
		}	
	}

public class Example2 
{
	public static void main(String[] args) 
	{
		SBH sbh = new SBH();
		sbh.deposite();
		sbh.withdrawls();
		sbh.aadharLink();
		sbh.minBal();
		sbh.kyc();
		
		ICICI icici = new ICICI();
		icici.deposite();
		icici.withdrawls();
		icici.aadharLink();
		icici.minBal();
		icici.kyc();		
	}
}
