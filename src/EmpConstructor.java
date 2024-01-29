
public class EmpConstructor {

static int Emp_Id;
static String Emp_Name;
static String Emp_Address;
static String Emp_Jobrole;
static int Salary;

EmpConstructor (int a, String b, String c, String d, int e)
{
	Emp_Id = a;
	Emp_Name = b;
	Emp_Address = c;
	Emp_Jobrole = d;
	Salary = e;
	
}
public static void print()
{
	System.out.println(Emp_Id);
	System.out.println(Emp_Name);
	System.out.println(Emp_Address);
	System.out.println(Emp_Jobrole);
	System.out.println(Salary);
}

}
