package interfaceExample;

interface Employer
{
	abstract void joiningProcess(); // Abstract is optional. It will take default if we not write.
	void allocateWork();
	void pf();
}

class Infosys implements Employer
{
	@Override
	public void joiningProcess() 
	{
		System.out.println("Send Offer letter");
	}

	@Override
	public void allocateWork()
	{
		System.out.println("Assign Team");
	}

	@Override
	public void pf() 
	{
		System.out.println("Create PF Account");
	}

}

public class Example 
{
	public static void main(String[] args) 
	{
		Infosys s = new Infosys();
		s.joiningProcess();
		s.allocateWork();
		s.pf();
	}

}
