import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Runner
{
    private static int depth = 0;
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

    public static boolean binary_search(MyArrayList<String> list, int start, int end, String target)
    {
        depth++;
        if (start > end)
        {
            return false;
        }

        int mid = (start + end) / 2;
        if (list.get(mid).equals(target))
        {
            return true;
        }
        else if (list.get(mid).compareTo(target) > 0)
        {
            return binary_search(list, start, mid - 1, target);
        }
        else
        {
            return binary_search(list, mid + 1, end, target);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(new FileReader(:));
        MyArrayList<String> lst = new MyArrayList<String>();
        try
        {
            
        }
        
    }
}