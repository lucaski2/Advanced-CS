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
        sort();
    }

    public void sort()
    {
        for (int i = 0; i < mySchedule.size(); i++)
        {
            for (int j = i + 1; j < mySchedule.size(); j++)
            {
                if (mySchedule.get(i).getFirst() > mySchedule.get(j).getFirst())
                {
                    Pair<Integer, String> temp = mySchedule.get(i);
                    mySchedule.set(i, mySchedule.get(j));
                    mySchedule.set(j, temp);
                }
            }
        }
    }

    public ArrayList

    public String toString()
    {
        String result = "";
        for (int i = 0; i < mySchedule.size(); i++)
        {
            result += mySchedule.get(i).getFirst() + " : " + mySchedule.get(i).getSecond() + '\n';
        }
        return result;
    }
}