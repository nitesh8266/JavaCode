import java.util.Scanner;

public class ArrayIssue {

	public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				int [] [] a = new int [3][2];

				for(int i=0; i<=2;i++)
				{
					for(int j=0; j<=1;j++)
					{
						System.out.print("Enter Value"+ " ");
						
							a [i][j]=  sc.nextInt();
					}
				}
				
				for(int i=0; i<=2;i++)
				{
					for(int j=0; j<=1;j++)
					{
						System.out.print("print value: " +a [i][j]+" ");
						
							
					}
					System.out.println();
				}

			}

		}
