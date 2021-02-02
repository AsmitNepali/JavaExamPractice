class Student
{
	int n;
	String name;
	void insertRecord(int n, String name)
	{
		this.name = name;
		this.n = n;
	}

	void displayInformantion()
	{
		System.out.println(n+" "+name);
	}
}
class TestStudent
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.insertRecord(13,"Asmit");
		s1.displayInformantion();
		s2.insertRecord(35,"Shreeejan");
		s2.displayInformantion();
	}
}