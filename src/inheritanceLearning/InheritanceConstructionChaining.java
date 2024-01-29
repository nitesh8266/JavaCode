//⦁ No we cannot inherit constructors because they are not member of a
//class(members of classs are methods and variables) and constructors
//are mainly used for intialistion of Non‐static variable.
//⦁ Constructors cannot be inherited but they can be invoked by using call to Super

package inheritanceLearning;

class InheritanceConstructionChaining
{
//
//public InheritanceConstructionChaining (int a)
//	{
//	System.out.println("This is Fisrt Constructor: ");
//	}
//}
//
//class secound extends InheritanceConstructionChaining
//{
//	public secound()
//	{
//		super(500);
//		System.out.println("This is 2nd Constructor: ");
//	}
//}
//example  - 2
	
	String accname;
	public InheritanceConstructionChaining(String accname1)
	{
		this.accname = accname1;
		System.out.println(accname);
	}
}

class Bank extends InheritanceConstructionChaining
{
	public Bank()
	{
		super("Nitesh");
	}
}