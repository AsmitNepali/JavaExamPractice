class InvalidAgeException extends Exception{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

class Sample
{
	static void validate(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not valid"); 
		}
		else
			System.out.println("Welcom to vote");
	}
	public static void main(String args[])
	{
		try{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println(m);
		}
		System.out.println("Rest of the code");
	}
}