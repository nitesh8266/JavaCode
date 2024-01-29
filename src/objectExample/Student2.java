package objectExample;

public class Student2 
{
	String studentName;
	int studentId;
	
	public Student2(String studentName,int studentId )
	{
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	public String toString()
	{
		return studentName;
	}
	
	public int hashCode()
	{
		return studentId;
	}
	
	public boolean equals(Object o)
	{
		return this.hashCode()==o.hashCode();
	}
	
	public static void main(String[] args) 
	{
		Student2 s = new Student2("Nitesh", 1023);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		
		Student2 s1 = new Student2("Nitesh", 1023);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		
		System.out.println(s.equals(s1));
	}

}
