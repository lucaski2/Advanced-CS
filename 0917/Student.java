
public class Student
{
    private String name;
    private int id;

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public String toString()
    {
        return name + " (" + id + ")";
    }
    @Override
    public boolean equals(Object o)
    {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (o.getClass() != this.getClass())
            return false;
        Student s = (Student)o;
        return s.id == id;
    }
}