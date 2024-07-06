package interfaceExample;

interface Employer1
{
	void joiningProcess();
	void pF();
	void allocatework();
}

abstract class Infosys1 implements Employer1
{
	public void joiningProcess()
	{
		System.out.println("Selection Process");
	}
	
	public void pF()
	{
		System.out.println("Pf Given");
	}	
		abstract public void location();
}

class HrDepartment extends Infosys1
{

	@Override
	public void allocatework() 
	{
		System.out.println("Provided Task");
	}

	@Override
	public void location() 
	{
		System.out.println("Gurgaon");
	}	
}
public class Example4 
{
	public static void main(String[] args) 
	{
		HrDepartment b = new HrDepartment();
		b.joiningProcess();
		b.allocatework();
		b.pF();
	}
}
