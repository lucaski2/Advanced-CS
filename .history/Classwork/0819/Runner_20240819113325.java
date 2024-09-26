import java.util.Scanner;


public class Runner
{
    public static void main(String[] args) {
        Profile profiles[] = new Profile[10];
        Scanner sc = new Scanner(System.in);
        String names[] = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isaac", "Jenny"};
        int ages[] = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = (int)(Math.random() * 100);
            profiles[i] = new Profile(names[i], ages[i]);
        }

        while (true)
        {
            System.out.println("Names: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(profiles[i].getName());
            }
            System.out.print("Sort or scramble? (1/2)");
            int choice = sc.nextInt();
            if (choice == 1)
            {
                
            }
            else if (choice == 2)
            {
                
            }
        }


    }
}