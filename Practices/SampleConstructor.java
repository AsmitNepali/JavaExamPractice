class SampleConstructor
{
	String fname,lname;
	SampleConstructor(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	SampleConstructor()
	{
		System.out.println("Hello World!");
	}

	public static void main(String args[])
	{
		// SampleConstructor s1 = new SampleConstructor();
		SampleConstructor s2 = new SampleConstructor("Asmit","Nepali");
		System.out.println(s2.fname+" "+s2.lname);
	}
}