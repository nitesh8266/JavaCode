
public class ArrayStudentMarks 
{

	public static void main(String[] args) 
	{ 
		
	        int N = 6, 
	        		total_marks = 0; 
	        int marks[] = { 89, 75, 42, 60, 65, 91 }; 
	 
	        for (int i = 0; i < N; i++) 
	        { 
	            total_marks += marks[i]; 
	        } 
	        System.out.println(total_marks); 
	  
	       int percentage;
	        percentage = (total_marks/N);
	        System.out.println( percentage); 
	 } 
}