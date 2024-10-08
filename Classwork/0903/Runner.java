import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        MyArrayList<Task> tasks = new MyArrayList<Task>();
        Scanner sc = new Scanner(System.in);
        outer:
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
        
            switch (choice){
                case 1:
                    System.out.println(tasks);
                    break;
                case 2:
                    System.out.println("Enter the name of the task: ");
                    String name = sc.next();
                    System.out.print("Enter the rank of the task: ");
                    int rank = sc.nextInt();
                    Task t = new Task(name, rank);
                    tasks.add(t);
                    break;
                case 3:
                    System.out.println("Enter the name of the task: ");
                    String n = sc.next();
                    System.out.print("Enter the rank of the task: ");
                    int r = sc.nextInt();
                    Task res = tasks.remove(new Task(n, r));
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
                    String na = sc.next();
                    System.out.print("Enter the rank of the task: ");
                    int ra = sc.nextInt();
                    Task ta = new Task(na, ra);
                    tasks.add(ta, location);
                    break;
                
                case 5:
                    System.out.println("Enter the index of the task to remove: ");
                    int index = sc.nextInt();
                    Task rem = tasks.remove(index);
                    break;
                
                case 6:
                    System.out.println("Enter the location of the task to replace: ");
                    int loc = sc.nextInt();
                    System.out.print("Enter the name of the task: ");
                    String nam = sc.next();
                    System.out.print("Enter the rank of the task: ");
                    int ran = sc.nextInt();
                    Task tas = new Task(nam, ran);
                    tasks.set(tas, loc);
                    break;
                case 7:
                    
                    for (int i = 0; i < tasks.size(); i++)
                    {
                        for (int j = 0; j < tasks.size() - i - 1; j++)
                        {
                            if (tasks.get(j).getRank() > tasks.get(j + 1).getRank())
                            {
                                Task temp = tasks.get(j);
                                tasks.set(tasks.get(j + 1), 1   
                                """"""""""\\\\\\\\\=j);
                                tasks.set(temp, j + 1);
                            }
                        }
                    }
                    break;
                
                case 8:
                    break outer;
            }
            
        }
    }
}