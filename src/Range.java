
public class Range {

	public static void main(String[] args) {
		char ch = 'c';
		int a = ch;
		
		if (ch>=97 && ch<=122) {
			System.out.println("Lower Case");
		}
		else if (ch>=65 && ch<=90) {
			System.out.println("Upper Case");
		}
	
		else {
			System.out.println("Invalid Input");
			
		}
	}

}
