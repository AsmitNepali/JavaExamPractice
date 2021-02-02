public class AddNumbers
{
	int a = 20;
	int b = 20;
	public void sum()
	{
		System.out.println(a+b);
	}

	public void sum(int num1, double num2)
	{
		System.out.println("sum "+ (num1+num2));
	}

	public static void main(String args[])
	{
		AddNumbers obj = new AddNumbers();
		obj.sum();
		obj.sum(12,12.22);
	}
}