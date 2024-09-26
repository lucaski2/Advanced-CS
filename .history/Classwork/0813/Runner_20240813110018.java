import java.util.Scanner;

public class Runner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        Animal a = null;
        while (true)
        {
            System.out.println("Options: \n1. Create animal\n2. Print animal\n 3. Change name\n4. Change age\n5. Exit");
            int choice = sc.nextInt();
            if (choice == 1)
            {
                System.out.println("Please print the type, the name, and the age of the animal: ");
                
                
            } else if (choice == 2){

            } else if (choice == 3){
                
            } else if (choice == 4){
                
            } else if (choice == 5){
                break;
            } else {
                System.out.println("Please enter a valid choice.")
            }
        }
        
    }
}

