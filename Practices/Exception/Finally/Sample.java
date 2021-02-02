class Sample
{
	public static void main(String arg[])
	{
		int data;
		try
		{
			data = 500/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This block is exucate any way!");
		}
	}
}