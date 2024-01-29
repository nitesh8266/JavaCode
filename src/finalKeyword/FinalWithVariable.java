package finalKeyword;

public class FinalWithVariable 
{
	// final int a; //It is mandatory to intialise final variable while declaraion, if we did not intialise we will get compile time error
	
	final String MarritalStatus = "Merried";
	
	public static void main(String[] args)
	{	
		FinalWithVariable a = new FinalWithVariable();
		//a.MarritalStatus = "Single";  //CTE because final cannot be reinitialized 
		
		System.out.println(a.MarritalStatus);
	}

}
