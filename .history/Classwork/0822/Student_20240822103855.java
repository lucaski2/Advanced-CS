
public class Student extends Profile
{
    public Student(String s)
    {
        super(s);
    }
    public String saying()
    {
        return "I am a student. " + super.saying();
    }
}