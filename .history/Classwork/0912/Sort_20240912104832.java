
public class Sort
{
    public MyArrayList<String> lst;

    public Sort()
    {
        lst = new MyArrayList<String>();
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
        MyArrayList<String> temp = new MyArrayList<String>();
        int p1 = left;
        int p2 = middle;
        while (p1 <= right || p2 <= right)
        {
            if (p1 > right)
            {
                temp.add(lst.get(p2));
                p2++;
            }
            else if (p2 > right)
            {
                temp.add(lst.get(p1));
                p1++;
            }
            else if (lst.get(p1).compareTo(lst.get(p2)) > 0)
            {
                temp.add(lst.get(p2));
                p2++;
            }
            else
            {
                temp.add(lst.get(p1));
                p1++;
            }
        }

        
    }

}


