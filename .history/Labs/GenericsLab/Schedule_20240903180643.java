import java.util.ArrayList;
public class Schedule
{
    ArrayList<Pair<Integer, String>> mySchedule;
    public Schedule()
    {
        mySchedule = new ArrayList<Pair<Integer, String>>();
    }

    public void addClass(int time, String className)
    {
        mySchedule.add(new Pair<Integer, String>(time, className));
    }

    

}