package EncapsulationExample;

class Employees
{
	private String empName;
	private int empID;
	
	public void setempName(String empName)
	{
		this.empName = empName;
	}
	
	public String getempName()
	{
		return empName;
	}
	
	public void setempID(int empID)
	{
		this.empID = empID;
	}
	
	public int getempID()
	{
		return empID;
		
	}
}

public class Employee {

	public static void main(String[] args) 
	{	
		Employees a = new Employees();
		a.setempName("Nitesh");
		System.out.println(a.getempName());
	}
}
