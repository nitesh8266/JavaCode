import java.util.Scanner;

public class FactorialScannerclass {

    public static void main(String[] args) {

        int number;
        System.out.print("Enter the number: ");
       
        Scanner scanner = new Scanner(System.in);
       
        number = scanner.nextInt();
       
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}