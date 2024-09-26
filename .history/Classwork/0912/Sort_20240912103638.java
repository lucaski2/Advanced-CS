import java.util.ArrayList;

public class Sort
{
    private ArrayList<String> lst;

    public Sort()
    {
        lst = new ArrayList<String>();
    }
    
    public void bubbleSort()
    {
        for (int i = 0; i < lst.size(); i++)
        {
            for (int j = 0; j < lst.size() - 1; j++)
            {
                if (lst.get(j).compareTo(lst.get(j + 1)) > 0)
                {
                    String temp = lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);
                }
            }
        }
    }

    public void scramble()
    {
        
    }

}


