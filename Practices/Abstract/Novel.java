abstract class Book
{
	String name,author,publisher;
	int total_page;
	Book()
	{
		name = "Read Dad and Poor Dad";
		author = "Robor Kiosaky";
		publisher = "PeaCock Book";
		total_page = 710;
	}

	abstract void getBookType();
}

class Magazine extends Book
{
	String type;
	Magazine()
	{
		type = "Magazine";
	}
	void getBookType()
	{
		System.out.println("Magazine");
	}
	public static void main(String args[])
	{
		Magazine m = new Magazine();
		m.getBookType();
	}
}

public class Novel extends Book{
	String type;
	Novel()
	{
		type = "Novel";
	}
	void getBookType()
	{
		System.out.println("Novel");
	}
	public static void main(String args[])
	{
		Novel m = new Novel();
		m.getBookType();
	}
}