package finalKeyword;

//if a class is declared as final, we cannot inherit or extends that class. So,therefore a super class can never be final. 

//final class University
//{
//	public void results()
//	{
//		System.out.println("Student Result");
//	}
//}
//
//class Student extends University // CTE
//{
//	
//}

//But a final class can extends Non final class, i.e, subclass can be final but super class cannot be final. 

class University
{
	public void result()
	{
		System.out.println("Student Result");
	}
}

final class Student extends University
{
	public void studentPortal()
	{
		System.out.println("Student Can view their Result");
	}
}

//class Admin extends Student //class Andhra cannot be extended by other class because it is final. 
//{
//	
//}

public class FinalWithClass 
{
	public static void main(String[] args) 
	{
		Student s= new Student();
		s.result();
		s.studentPortal();
	}

}
