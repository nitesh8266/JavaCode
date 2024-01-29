public class Learning2 
{
	public static void main(String[] args) 
	{
		int i = 876;
		int sum = 0;
		int remainder;
		int temp = i;
	
		while (i>0)
		{
			remainder = i%10;
			i = i/10;
			sum = sum + remainder;
					
		}
		
			System.out.print(sum);
	}
		
}