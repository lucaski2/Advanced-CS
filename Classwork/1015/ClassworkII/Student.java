
public class Student
{
    private int id;
    private String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object other)
    {
        Student otherStudent = (Student) other;
        return id == otherStudent.id;
    }

    public String toString()
    {
        return "ID: " + id + ", Name: " + name;
    }

    public int hashCode()
    {
        return Integer.hashCode(id);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}