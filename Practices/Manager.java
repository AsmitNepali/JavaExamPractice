class Human
{
	String name;
	int age;
}

class Employee extends Human
{
	double salary;

	public void showData()
	{
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.age);
		System.out.println("Salary: "+ this.salary);
	}
}

public class Manager extends Employee
{
	public static void main(String args[])
	{
		Manager obj = new Manager();
		obj.name = "Harry";
		obj.age = 18;
		obj.salary = 50000.00;
		obj.showData();
	}
}