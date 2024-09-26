import java.util.ArrayList;
public class Schedule
{
    ArrayList<Pair<Integer, String>> mySchedule;
    public Schedule()
    {
        mySchedule = new ArrayList<Pair<Integer, String>>();
    }

    public void addClass(int period, String className)
    {
        for (int i = 0; i < mySchedule.size(); i++)
        {
            if (mySchedule.get(i).getFirst() == period)
            {
                mySchedule.set(i, new Pair<Integer, String>(period, className));
                sort();
                return;
            }
        }
        mySchedule.add(new Pair<Integer, String>(period, className));
    }


}