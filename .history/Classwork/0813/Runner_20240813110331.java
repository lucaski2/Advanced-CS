import java.util.Scanner;

public class Runner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = null;
        while (true)
        {
            System.out.println("Options: \n1. Create animal\n2. Print animal\n 3. Change name\n4. Change age\n5. Exit");
            int choice = sc.nextInt();
            if (choice == 1)
            {
                System.out.println("Please print the type, the name, and the age of the animal: ");
                String type = sc.next();
                String name = sc.next();
                int age = sc.nextInt();
                a = new Animal(type, name, age);
            } else if (choice == 2){
                if (a != null)
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println("Please create an animal first.");
                }
            } else if (choice == 3){
                if (a != null){
                System.out.print("Please enter a new animal name: ");
                String nm = sc.next();
                Manager.changeMe(a, nm, a.getAge());
            } else if (choice == 4){
                if (a == null)
                {
                    System.out.println("Please create an animal first.");
                }
                else
                {
                    System.out.print("Please enter a new animal age: ");
                    int ag = sc.nextInt();
                    
                }
            } else if (choice == 5){
                break;
            } else {
                System.out.println("Please enter a valid choice.");
            }
        }
        
    }
}

