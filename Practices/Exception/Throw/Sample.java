public class Sample
{
	static void validate(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("Your are capable to vote, Congratulation!");
		}
	}

	public static void main(String args[])
	{
		validate(19);
		System.out.println("Rest of the code .....");
	}
}