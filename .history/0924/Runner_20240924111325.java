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
        

    }
}