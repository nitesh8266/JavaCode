class Learning
{
	 public static void main(String []args)
	{
		 int a= 7;
		 boolean b = true;
		 int i = 2;
		 do
		 	{ 
		 		if (a%i==0)
		 		{
		 			b = false;
		 			break;
		 		}
		 	i++;
		 		if (b==true)
		 		{
		 			System.out.println("Prime number: " + i); 
		 		}
		 		else
			 	{
				 	System.out.println("Not Prime number"); 
			 	}
		 	}
		 while (i<a);

		 }
		 }
