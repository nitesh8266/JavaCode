import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Please Enter id:");
		int emp_id = a.nextInt();
		
		System.out.print("Please Enter emp_salary:");
		float emp_salary = a.nextFloat();
		
		System.out.print("Please Enter emp name:");
		String emp_name = a.next();
		
		System.out.print("Please Enter emp dsgn:");
		String emp_degn = a.next();
		
	System.out.println(emp_id);
	System.out.println(emp_salary);
	System.out.println(emp_name);
	System.out.println(emp_degn);


		

	}

}
