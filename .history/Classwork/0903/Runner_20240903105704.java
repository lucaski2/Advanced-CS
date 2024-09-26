import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        MyArrayList<Task> tasks = new MyArrayList<Task>();
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            
            // SView Task List (Include the name and rank).
            // Add a Task (Ask for task name and rank). Duplicate task name will not be allowed.  Duplicate task name will be replaced with a new task rank.
            // Remove a Task by Name and Rank.  (Create a new Task object with that name and rank. Call remove(E) passing in that object.)
            // Add a Task given a location.
            // Remove a Task by index location.
            // Replace a Task by location.
            // Sort by Rank.  1 is the highest priority followed by subsequent numbers.
            // Quit
            System.out.println("1. View Task List");
            System.out.println("2. Add a Task");
            System.out.println("3. Remove a Task");
            System.out.println("4. Add a Task given a location");
            System.out.println("5. Remove a Task by index location");
            System.out.println("6. Replace a Task by location");
            
            
        }
    }
}
