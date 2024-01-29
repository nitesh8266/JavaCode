package methodOverriding;

class Zomato
{
	public void restaurant()
	{
		System.out.println("Search food based on Location");
	}
}

class Customer extends Zomato
{
	public void restaurant()
	{
		System.out.println("Search food based on Ratings");
	}
}

public class Question1 
{
	public static void main(String[] args) 
	{
		Zomato a = new Zomato();
		a.restaurant();
		
		Customer b = new Customer();
		b.restaurant();
	}

}
