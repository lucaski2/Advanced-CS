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
                for(int i = 0; i < ages.length; i++){
                    for(int j = 0; j < ages.length-i-1; j++){
                        if (ages[j] > ages[j+1]){
                            int temp = ages[j];
                            ages[j] = 
                        }
                    }
                }
            }
            else if (choice == 2)
            {
                for (int i = 0; i < 10; i++)
                {
                    int randomIndex = (int)(Math.random() * 10);
                    Profile temp = profiles[i];
                    profiles[i] = profiles[randomIndex];
                    profiles[randomIndex] = temp;
                }
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }


    }
}