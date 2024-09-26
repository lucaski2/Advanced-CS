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
            System.out.println("7. Sort by Rank");
            System.out.println("8. Quit");
            System.out.print("Enter a number: ");
            
            int choice = sc.nextInt();
            OUTTER;
            switch (choice){
                case 1:
                    System.out.println(tasks);
                    break;
                case 2:
                    System.out.print("Enter the name of the task: ");
                    String name = sc.next();
                    System.out.print("Enter the rank of the task: ");
                    int rank = sc.nextInt();
                    Task t = new Task(name, rank);
                    tasks.add(t);
                    break;
                case 3:
                    String name = sc.next();
                    int rank = sc.nextInt();
                    Task res = tasks.remove(new Task(name, rank));
                    if (res == null){
                        System.out.println("Task not found.");
                    }
                    else
                    {
                        System.out.println("Task removed.");
                    }
                    break;
                
                case 4:
                    System.out.println("Enter a location: ");
                    int location = sc.nextInt();
                    System.out.print("Enter the name of the task: ");
                    String name = sc.next();
                    System.out.print("Enter the rank of the task: ");
                    int rank = sc.nextInt();
                    Task t = new Task(name, rank);
                    tasks.add(location, t);
                    break;
                
                case 5:
                    System.out.println("Enter the index of the task to remove: ");
                    int index = sc.nextInt();
                    Task rem = tasks.remove(index);
                    break;
                
                case 6:
                    int location = sc.nextInt();
                    tasks.remove(location);
                    
                
                case 7:
                    
            }
            
        }
    }
}
