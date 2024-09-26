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
                System.out.println(profiles[i]);
            }
            System.out.print("Quit, Sort by age, scramble, or sort by name? (0/1/2/3)");
            int choice = sc.nextInt();
            if (choice == 1)
            {
                for(int i = 0; i < ages.length; i++){
                    for(int j = 0; j < ages.length-i-1; j++){
                        if (profiles[j].getAge() > profiles[j + 1].getAge()){
                            Profile temp = profiles[j];
                            profiles[j] = profiles[j+1];
                            profiles[j+1] = temp;
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
            else if (choice == 0)
            {
                break;
            } else if (choice == 3){
                for(int i = 0; i < names.length; i++){
                    for(int j = 0; j < ages.length-i-1; j++){
                        if (profiles[j].getAge() > profiles[j + 1].getAge()){
                            Profile temp = profiles[j];
                            profiles[j] = profiles[j+1];
                            profiles[j+1] = temp;
                        }
                    }
                }
                //check to see if the list is in order alphabetically
                if( wordList.get(0).compareTo( wordList.get(1) ) > 0 ) {
                    //swap because it is out of order.  compareTo returns a 
                ///positive when wordList.get(0) is
                    //alphabetically larger than wordList.get(1)
                }
            } else
            {
                System.out.println("Invalid choice");
            }
        }
    }
}