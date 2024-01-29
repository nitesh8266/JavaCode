package Constructor;

public class ConstructorChaining 
{
	
	public ConstructorChaining()
	{
		this("The Hunger Games", 374, "English");
	}
	
	public ConstructorChaining(String bookTitle, int bookPages, String bookLanguage)
	{
		this("Suzanne Collin", 4, "October 14, 2008", 207402);
		System.out.println("Book Title: "+bookTitle);
		System.out.println("Total Pages: "+bookPages);
		System.out.println("Language: "+bookLanguage);
	}
	public ConstructorChaining(String authorName, int rating, String published, long review)
	{
		System.out.println("Author Name: "+authorName);
		System.out.println("Book Rating: "+rating);
		System.out.println("Published: "+published);
		System.out.println("Total Reviews: "+review);
		System.out.println("--------------------------------------------");
	}
	
	public static void main(String[] args) 
	{
		ConstructorChaining a = new ConstructorChaining();
	}

}
