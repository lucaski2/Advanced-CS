import java.util.HashMap;
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1, new Student("John", "MVHS"));
        map.put(2, new Student("Jane", "LAHS"));
        map.put(3, new Student("Jack", "AVHS"));
        map.put(4, new Student("Jill", "AVHS"));
        map.put(5, new Student("Jim", "MVHS"));

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            //In a loop, have the following option
            // 1. View All Students. (Show ID, Names, and School)
            // 2. Add a new student. (See if you can add a student with same name but different ids and same id but different names).
            // 3. Ask the user for an id, and check to see if it exists.
            // 4. Get a student's name and school given an ID.
            // 5. Remove a student given an ID.
            // 6. Search for a student by name and check to see if it exists.
            // 7. Quit.
            System.out.println("1. View All Students");
            System.out.println("2. Add a new student");
            System.out.println("3. Check if a student exists");
            System.out.println("4. Get a student's name and school given an ID");
            System.out.println("5. Remove a student given an ID");
            System.out.println("6. Search for a student by name and check to see if it exists");
            System.out.println("7. Quit");

            int choice = scanner.nextInt();

            if (choice == 1)
            {
                for (int id : map.keySet())
                {
                    Student student = map.get(id);
                    System.out.println("ID: " + id + " Name: " + student.name + " School: " + student.school);
                }
            }
            else if (choice == 2)
            {
                System.out.println("Enter the name of the student");
                String name = scanner.next();
                System.out.println("Enter the school of the student");
                String school = scanner.next();
                System.out.println("Enter the id of the student");
                int id = scanner.nextInt();
                map.put(id, new Student(name, school));
            }
            else if (choice == 3)
            {
                System.out.println("Enter the id of the student");
                int id = scanner.nextInt();
                if (map.containsKey(id))
                {
                    System.out.println("Student exists");
                }
                else
                {
                    System.out.println("Student does not exist");
                }
            }
            else if (choice == 4)
            {
                System.out.println("Enter the id of the student");
                int id = scanner.nextInt();
                if (map.containsKey(id))
                {
                    Student student = map.get(id);
                    System.out.println("Name: " + student.name + " School: " + student.school);
                }
                else
                {
                    System.out.println("Student does not exist");
                }
            }
            else if (choice == 5)
            {
                System.out.println("Enter the id of the student");
                int id = scanner.nextInt();
                if (map.containsKey(id))
                {
                    map.remove(id);
                }
                else
                {
                    System.out.println("Student does not exist");
                }
            }
            else if (choice == 6)
            {
                System.out.println("Enter the name of the student");
                String name = scanner.next();
                boolean exists = false;
                for (int id : map.keySet())
                {
                    Student student = map.get(id);
                    if (student.name.equals(name))
                    {
                        exists = true;
                        break;
                    }
                }
                if (exists)
                {
                    System.out.println("Student exists");
                }
                else
                {
                    System.out.println("Student does not exist");
                }
            }
            else if (choice == 7)
            {
                break;
            }

        }
    }
}
