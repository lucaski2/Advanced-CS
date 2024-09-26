import java.util.ArrayList;
public class Student
{
    private String name;
    private Schedule mySchedule;
    public Student(String name)
    {
        this.name = name;
        mySchedule = new Schedule();
    }

    public void addClass(int period, String className)
    {
        mySchedule.addClass(period, className);
    }
    public String getName()
    {
        return name;
    }


    public String toString()
    {
        return name + '\n' + mySchedule.toString();
    }
    public ArrayList<Pair<Integer, String>> getSchedule()
    {
        return mySchedule.getSchedule();
    }
}