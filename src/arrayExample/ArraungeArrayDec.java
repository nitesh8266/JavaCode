package arrayExample;

import java.util.Arrays;

public class ArraungeArrayDec
{
	public static void main(String[] args)
	{
		int [] a = {22, 5, 6, 88, 9};
		
		int temp;
		
		for (int i = 0; i<a.length; i++)
		{
			for (int j = 0; j<a.length-1; j++)
			{
				if (a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println(a[i]);
		}
		//System.out.println(Arrays.toString(a));
	}

}
