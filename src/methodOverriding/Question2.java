package methodOverriding;

class Rbi
{
	public void rateOfInterest()
	{
		System.out.println("Rate of Interest of Rbi is: 12.14");
	}
	public void tenure()
	{
		System.out.println("Tenure of Rbi is: 3 Years");
	}
}

class Sbi extends Rbi
{
	public void rateOfInterest()
	{
		System.out.println("Rate of Interest of SBI is: 14.14");
	}
	public void tenure()
	{
		System.out.println("Tenure of SBI is: 5 Years");
	}
}

class Hdfc extends Rbi
{
	public void rateOfInterest()
	{
		System.out.println("Rate of Interest of HDFC Bank is: 15.14");
	}
	public void tenure()
	{
		System.out.println("Tenure of HDFC is: 6 Years");
	}
}

class Idfc extends Rbi
{
	public void rateOfInterest()
	{
		System.out.println("Rate of Interest of IDFC Bank is: 16.18");
	}
	public void tenure()
	{
		System.out.println("Tenure of IDFC is: 4 Years");
	}
}
public class Question2 
{
	public static void main(String[] args) 
	{
		Rbi a = new Rbi();
		a.rateOfInterest();
		a.tenure();
		
		Sbi b = new Sbi();
		b.rateOfInterest();
		b.tenure();
		
		Hdfc c = new Hdfc();
		c.rateOfInterest();
		c.tenure();
		
		Idfc d = new Idfc();
		d.rateOfInterest();
		d.tenure();
		
	}

}
