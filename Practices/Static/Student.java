class Student
{
	int roll_no;
	String name;
	// String batch;
	static String college = "GCES";
	static String batch;

	// Constructor
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}

	static void change()
	{
		batch = "2018";
	}

	public static void main(String args[])
	{
		Student.change();
		Student s1 = new Student(13,"Asmit");
		System.out.println(s1.roll_no+" "+s1.name+" "+s1.college+" "+batch);
	}
}