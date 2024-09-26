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
        for (int i = 0; i < lst.size(); i++)
        {
            int r = (int)(Math.random() * lst.size());
            String temp = lst.get(i);
            lst.set(i, lst.get(r));
            lst.set(r, temp);
        }
    }

    public String toString()
    {
        return lst.toString();
    }
    public void mergeSort(int left, int right)
    {
        if (left < right)
        {
            int middle = (left + right) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    public void merge(int left, int middle, int right)
    {
        public 
    }

}


