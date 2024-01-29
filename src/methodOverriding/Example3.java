package methodOverriding;

class India
{
	public void lockdown()
	{
		System.out.println("Lockdown date: 24 March 2020");
	}
}

class Bihar
{
	public void lockdown()
	{
		System.out.println("Lockdown date: 25 March 2020");
	}
}

public class Example3 
{
	public static void main(String[] args) 
	{
		India a = new India();
		a.lockdown();
		
		Bihar b  = new Bihar();
		b.lockdown();
	}

}
