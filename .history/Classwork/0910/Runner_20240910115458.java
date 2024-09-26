
public class Runner
{
    public static void sort(MyArrayList<String> list)
    {
        // sort, list of strings

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i).compareTo(list.get(j)) > 0)
                {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void binary_search(MyArrayList<String> list, )
    public static void main(String[] args) {
        
    }
}