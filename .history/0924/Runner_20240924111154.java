import java.util.Scanner;

public class Runner{

    public static void sort(DLList lst)
    {
        for (int i = 0; i < lst.size(); i++)
        {
            for (int j = 0; j < lst.size() - 1 - i; j++)
            {
                if ((int)lst.get(j) > (int)lst.get(j + 1))
                {
                    int temp = (int)lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        DLList<Integer> lst = new DLList<Integer>();

        for (int i = 0; i < 1000; i++) {
            lst.add((int)(Math.random() * lst.size()) + 1);
        }
    }

        for (int i = 0; i < 1000; i++)
        {
            System.out.println(lst.remove((int)(Math.random() * lst.size())));
        }

    }
}