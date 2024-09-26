import java.util.Scanner;

public class Runner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = null;
        Manager m 
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
            } else if (choice == 3){
                System.out.print("Please enter a new animal name: ");
                String nm = sc.next();
                
            } else if (choice == 4){
                
            } else if (choice == 5){
                break;
            } else {
                System.out.println("Please enter a valid choice.");
            }
        }
        
    }
}

