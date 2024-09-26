
public class Employee
{
    private String name;
    private String title;
    private double salary;

    public Employee(String name, String title, double salary)
    {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public String getTitle()
    {
        return title;
    }
    public double getSalary()
    {
        return salary;
    }
    public String toString()
    {
        return name + " is a " + title + " making " + salary;
    }
}