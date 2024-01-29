package oblectCasting;

//• Converting bigger primitive datatype into smaller primitive datatype is called as Narrowing.
//• Narrowing is also called as Explicit Casting.
//• byte<--short<--int<--long<--float<--double
//• Since, we are converting a bigger type into smaller type, there is loss of data.


public class NarrowingExample 
{
	public static void main(String[] args) 
	{
		double d = 145.44;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short) i;
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		
	}

}
