
public class Pair<T, K>
{
    private T employee;
    private K company;

    public Pair(T employee, K company)
    {
        this.employee = employee;
        this.company = company;
    }
    public T getEmployee()
    {
        return employee;
    }
    public K getCompany()
    {
        return company;
    }
    public String toString()
    {
        return employee.toString() + " works for " + company.toString();
    }
}