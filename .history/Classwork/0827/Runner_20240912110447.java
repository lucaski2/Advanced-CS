import java.util.Scanner;
import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<Toy> toys = new ArrayList<Toy>();
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("1. Add an animal.\n2. Add a toy.\n3. Display all animals.\n4. Display all toys.\n5. Quit");
            int c1 = sc.nextInt();
            if (c1 == 1)
            {
                System.out.println("Enter the name of the animal:");
                String name = sc.next();
                System.out.println("Enter the age of the animal:");
                int age = sc.nextInt();
                animals.add(new Animal(name, age));
            }
            else if (c1 == 2)
            {
                System.out.println("Enter the name of the toy:");
                String name = sc.next();
                System.out.println("Enter the price of the toy:");
                double price = sc.nextDouble();
                toys.add(new Toy(name, price));
            }
            else if (c1 == 3)
            {
                for (Animal a : animals)
                {
                    System.out.println(a);
                }
            }
            else if (c1 == 4)
            {
                for (Toy t : toys)
                {
                    System.out.println(t);
                }
            }
            else if (c1 == 5)
            {
                break;
            }
        }

    }
}