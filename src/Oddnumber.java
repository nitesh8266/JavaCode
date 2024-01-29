
public class Oddnumber {

	public static void main(String[] args) {
		for (int x=1; x<=50; x++) {
			if (x%2==0) {
				if (x==42)
					//continue;
					return;
				System.out.println(x);
			}
		}

	}

}
