package oblectCasting;

//• Converting smaller primitive datatype into bigger primitive datatype is called as widening.
//• Widening is also called as Implicit Casting.
//• byte-->short-->int-->long-->float-->double
//• Since, we are converting a smaller type into bigger type, there is no loss of data.

public class WideningExample 
{
	public static void main(String[] args) 
	{
		byte b = 45;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}

}
