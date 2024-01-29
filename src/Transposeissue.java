import java.util.Scanner;
					
public class Transposeissue {

	public static void main(String[] args) {
					
						Scanner sc = new Scanner(System.in);
						
						int [] [] a = new int [3][2];

						for(int i=0; i<=2;i++)
						{
							for(int j=0; j<=1;j++)
							{
								System.out.print("enter value: ");
								
									a [i][j]=  sc.nextInt();
							}
						}
						
						for(int i=0; i<=1;i++)
						{
							for(int j=0; j<=2; j++)
							{
								System.out.print("print value: " +a [j][i]+" ");
									
							}
							System.out.println();
						}

					}

				}

