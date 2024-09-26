import java.util.Scanner;
import java.util.ArrayList;
public class Runner
{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner sc = new Scanner(System.in);
        animals.add(new Cat("Whiskers"));
        animals.add(new Dog("Fido"));
        animals.add(new Bird("Tweety"));
        for (Animal a : animals) {
            a.printInfo();
            System.out.println();
        }
        while (true)
        {
            System.out.println("Options:");
            System.out.println("1. Print list by name");
            System.out.println("2. Search for animal by name");
            System.out.println("3. Remove animal by name");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1)
            {
                for (Animal a : animals)
                {
                    System.out.println(a.getName());
                }
            }
            else if (choice == 2)
            {
                System.out.println("Enter name of animal to search for:");
                String name = sc.nextLine();
                boolean found = false;
                for (Animal a : animals)
                {
                    if (a.getName().equals(name))
                    {
                        a.printInfo();
                        found = true;
                        break;
                    }
                }
                if (!found)
                {
                    System.out.println("Animal not found");
                }
            }
            else if (choice == 3)
            {
                System.out.println("Enter name of animal to remove:");
                String name = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < animals.size(); i++)
                {
                    if (animals.get(i).getName().equals(name))
                    {
                        animals.remove(i);
                        found = true;
                        break;
                    }
                }
                if (!found)
                {
                    System.out.println("Animal not found");
                }
            }
            else if (choice == 4)
            {
                break;
            }
        }
    }
}