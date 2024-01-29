package objectExample;

public class EqualsExample
{
	public static void main(String[] args) 
	{
		EqualsExample a = new EqualsExample();
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		
		EqualsExample b = new EqualsExample();
		System.out.println(b.toString());
		System.out.println(b.hashCode());
		
		EqualsExample c = a;
		System.out.println(c.toString());
		System.out.println(c.hashCode());
		
		System.out.println(a.equals(b));
	}

}
