import java.util.Scanner;

public class Runner{

    public static void sort(DLList lst)
    {
        
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
            lst.remove((int)(Math.random() * lst.size()));
        }
    }
}