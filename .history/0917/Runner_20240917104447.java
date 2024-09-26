import java.util.Scanner;

public class Runner
{
    public static void main(String[] args) {
        SLList<Student> students = new SLList<Student>();

        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));
        students.add(new Student("David", 4));
        students.add(new Student("Eve", 5));

    //     In a loop, ask the user for the following.
        // 1. Display List. (Use the toString of the SLList class).
        // 2. Ask the user to add a new student at an index location.
        // 3. Ask the user for an index location to remove.
        // 4. Ask the user to remove by id. (Use the remove(Object) method.) (Hint: Create a new student 
        // with any name but with the id given.  Then pass that object into the remove(Object) method. )
        // 5. Sort by student name.
        // 6. Scramble.
        // 7. Quit.

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display List");
            System.out.println("2. Add a new student at an index location");
            System.out.println("3. Remove by index");
            System.out.println("4. Remove by id");
            System.out.println("5. Sort by student name");
            System.out.println("6. Scramble");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(students);
                    break;
                case 2:
                    System.out.print("Enter the name of the student: ");
                    String name = scanner.next();
                    System.out.print("Enter the id of the student: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter the index: ");
                    int index = scanner.nextInt();
                    students.add(new Student(name, id), index);
                    break;
                case 3:
                    System.out.print("Enter the index: ");
                    index = scanner.nextInt();
                    students.remove(index);
                    break;
                case 4:
                    System.out.print("Enter the id: ");
                    id = scanner.nextInt();
                    students.remove(new Student("dummy", id));
                    break;
                case 5:
                    students.sort();
                    break;
                case 6:
                    students.scramble();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        
        

    }
}