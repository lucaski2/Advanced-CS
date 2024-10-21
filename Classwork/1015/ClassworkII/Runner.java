
import java.util.HashSet;
import java.util.Scanner;
public class Runner
{
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Joe"));
        students.add(new Student(3, "Bert"));
        students.add(new Student(4, "Bort"));
        students.add(new Student(5, "Simon"));
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("Options: 1. View all students\n2. Add student\n3. Check if student exists\n4. Remove student from ID\n5. Quit");
            int choice = sc.nextInt();
            if(choice == 1){
                for (Student s : students)
                {
                    System.out.println(s);
                }
            }
            else if(choice == 2){
                System.out.println("Enter name and id");
                String name = sc.next();
                int id = sc.nextInt();
                students.add(new Student(id, name));
            }
            else if(choice == 3){
                System.out.println("Enter an ID to check");
                int id = sc.nextInt();
                if (students.contains(new Student(id, "")))
                {
                    System.out.println("Student exists");
                }
                else
                {
                    System.out.println("Student does not exist");
                }
            }
            else if(choice == 4){
                System.out.println("Enter an ID to remove");
                int id = sc.nextInt();
                students.remove(new Student(id, ""));
            }
            else if(choice == 5){
                break;
            }
        }
    }
}