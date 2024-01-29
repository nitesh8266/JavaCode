package Constructor;

public class ParameterisedConstructor 
{
	public String empName;
	public String empDesignation;
	public int empSallary;
	public String empCompany;
	
	public ParameterisedConstructor(String empName1, String empDesignation1,int empSallary1,String empCompany1)
	{
		this.empName = empName1;
		this.empDesignation = empDesignation1;
		this.empSallary = empSallary1;
		this.empCompany = empCompany1;
		
	}
	
	public static void main(String[] args) 
	{
		ParameterisedConstructor a = new ParameterisedConstructor("Nitesh","Tester",200,"OTS" );
		a.detailsDisplay();
		
		ParameterisedConstructor b = new ParameterisedConstructor("Nitesh1","Tester1",200,"OTS" );
		b.detailsDisplay();
		
	}
	public void detailsDisplay()
	{
		System.out.println(empName);
		System.out.println(empDesignation);
		System.out.println(empSallary);
		System.out.println(empCompany);
	}
	

}
