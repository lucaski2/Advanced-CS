//Use your own MyArrayList. Create a list of 1,000 random numbers from 0-99.  Print out the list on one line with each number separated by a comma utilizing your MyArrayList toString().  Sort it using bubble sort (link).  Print the list again.   Count how many passes it took.  This means to have a counter variable and increase it in the inner loop.

//In a loop that runs 1000 times, pick a random index in your MyArrayList  to the size.  Remove that index. For each removal, print the index and the number removed.
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        int passes = 0;
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        for (int i = 0; i < 1000; i++)
        {
            list.add((int)(Math.random() * 100));
        }
        System.out.println(list);
        int passes = 0;
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.size() - 1; j++)
            {
                passes++;
                if (list.get(j) > list.get(j + 1))
                {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
        System.out.println(passes);
        for (int i = 0; i < 1000; i++)
        {
            int index = (int)(Math.random() * list.size());
            System.out.println("Index: " + index + " Number: " + list.remove(index));
        }
    }
}

