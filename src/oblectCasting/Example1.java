package oblectCasting;

class Student 
{
	void studentDetails()
	{
		System.out.println("Student Details are: ");
		System.out.println("Student Name: Nitesh Kumar");
		System.out.println("Student Id: 33 ");
		System.out.println("Degree - 58.3% \nInt  - 75% \nSSC- 66%");
	}
}

class Admin extends Student
{
	void studentEdit()
	{
		System.out.println("Student Details are: ");
		System.out.println("Student Name: Nitesh Kumar");
		System.out.println("Student Id: 33 ");
		System.out.println("Degree - 60% \nInt  - 75% \nSSC- 66%");
	}
}

public class Example1 
{
	public static void main(String[] args) 
	{
		Student a = new Admin(); //UpCasting
		a.studentDetails();		
		Admin b = (Admin) a;  //Downcasting or
		
//		Admin b = new Admin();
		b.studentDetails();
		b.studentEdit();
	}

}
