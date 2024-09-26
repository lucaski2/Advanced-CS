import java.util.Scanner;

public class Runner{

    public static void sort(DLList lst)
    {
        for (int i = 0; i < lst.size(); i++)
        {
            Node<Integer> temp = lst.get(i);
            int j = i;
            while (j > 0 && temp.getData() < lst.get(j - 1).getData())
            {
                lst.set(j, lst.get(j - 1));
                j--;
            }
            lst.set(j, temp);
        }
    }
    public static void main(String[] args) {
        DLList<Integer> lst = new DLList<Integer>();

        for (int i = 0; i < 1000; i++)
            lst.add((int)(Math.random() * lst.size()) + 1);
        }
        System.out.println(lst);
        sort(lst);
        System.out.println(lst);

        for (int i = 0; i < 1000; i++)
        {
            System.out.println(lst.remove((int)(Math.random() * lst.size())));
        }

        System.out.println(lst);
    }
}