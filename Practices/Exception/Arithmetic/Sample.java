public class Sample
{
	public static void main(String args[])
	{
	int a[] = new int[5];
		try
		{
			int data = 100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

		try
		{
			String s=null;  
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		try
		{
			String s="abc";   
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

		try
		{
			a[10] = 5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}