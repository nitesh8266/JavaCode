package StringExample;

public class IndexOfExample 
{
	public static void main(String[] args)
	{
//		It provides index value for given string or character
//		indexOf() returns -1, if character or string is not present
		
		String str = "Hello, World!";
        
        // Finding the index of a character
        int index1 = str.indexOf('o'); // returns 4 (index of the first 'o')
        int index2 = str.indexOf('o', 5); // returns 7 (index of the second 'o' starting from index 5)
        
        // Finding the index of a substring
        int index3 = str.indexOf("World"); // returns 7 (index of the start of the substring "World")
        
        // If the character or substring is not found, indexOf() returns -1
        int index4 = str.indexOf("Java"); // returns -1 (substring "Java" not found)
        
        System.out.println("Index of 'o': " + index1);
        System.out.println("Index of 'o' after index 5: " + index2);
        System.out.println("Index of 'World': " + index3);
        System.out.println("Index of 'Java': " + index4);
    }
}