
public class Pair<T, K>
{
    private T employee;
    private T company;

    public Pair(T employee, T company)
    {
        this.employee = employee;
        this.company = company;
    }
    public T getEmployee()
    {
        return employee;
    }
    public T getCompany()
    {
        return company;
    }
    public String toString()
    {
        return employee.toString() 
    }
}