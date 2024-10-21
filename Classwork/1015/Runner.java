import java.util.HashSet;
import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args) {
        String[] abc = "a b c d e f g h a b c d e f g h i j k".split(" ");
        HashSet<String> unique = new HashSet<String>();
        HashSet<String> doubles = new HashSet<String>();
        for (String letter : abc)
        {
            if (unique.contains(letter))
            {
                doubles.add(letter);
            }
            else
            {
                unique.add(letter);
            }
        }
        for (String letter : unique)
        {
            System.out.print(letter + " ");
        }
        System.out.println();
        for (String letter : doubles)
        {
            System.out.print(letter + " ");
        }
        System.out.println();
        
        String[] letters = "one two three one two three six seven one two".split(" ");
        HashSet<String> duplicates = new HashSet<String>();
        HashSet<String> singles = new HashSet<String>();
        HashSet<String> set = new HashSet<String>();
        for (String letter : letters)
        {
            if (set.contains(letter))
            {
                duplicates.add(letter);
            }
            else
            {
                singles.add(letter);
                set.add(letter);
            }
        }

        for (String letter : singles)
        {
            System.out.print(letter + " ");
        }
        System.out.println();
        for (String letter : duplicates)
        {
            System.out.print(letter + " ");
        }
        System.out.println();

        HashSet<Integer> odds = new HashSet<Integer>();
        HashSet<Integer> evens = new HashSet<Integer>();
        int[] nums = {3, 5, 4, 7, 5, 17, 29, 17, 4, 6, 56, 72, 6};

        for (int num : nums)
        {
            if (num % 2 == 0)
            {
                evens.add(num);
            }
            else
            {
                odds.add(num);
            }
        }
        for (int num : odds)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : evens)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] list1 = {1, 5, 9, 4, 6, 8, 12, 1};
        int[] list2 = {6, 5, 8, 9, 11, 7, 10, 11};
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int num : list1)
        {
            set1.add(num);
        }
        for (int num : list2)
        {
            set2.add(num);
        }
        set1.retainAll(set2);
        for (int num : set1)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        


    }
}
