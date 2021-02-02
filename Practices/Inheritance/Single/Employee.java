class Employee
{
    float salary;
    Employee()
    {
        salary = 50000;
    }

    void dislayInfo()
    {
        System.out.println(salary);
    }
}

class Programmer extends Employee
{

    String name = "Asmit Nepali";
public static void main(String args[]){


    Programmer p1 = new Programmer();
    System.out.println(p1.name);
    p1.dislayInfo();
    }
}