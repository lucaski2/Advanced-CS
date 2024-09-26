

public class Runner
{
    public static void main(String[] args) {
        Toy toy = new Toy("Action Figure", 10.99);
        Animal animal = new Animal("Dog", 5);
        Gift<Toy> toyGift = new Gift<Toy>(toy, "Birthday");
        Gift<Animal> animalGift = new Gift<Animal>(animal, "Christmas");
        
        while (true)
        {
            System.out.println("1. Display all \n2. Add a toy \n3. Add an animal \n4. Quit");
            int c1 = sc.nextInt();
            if (c1 == 1)
            {
                System.out.println(toyGift);
                System.out.println(animalGift);
            }
            else if (c1 == 2)
            {
                System.out.println("Enter the name of the toy: ");
                String name = sc.next();
                System.out.println("Enter the price of the toy: ");
                double price = sc.nextDouble();
                toy = new Toy(name, price);
                System.out.println("Enter the occasion: ");
                String occasion = sc.next();
                toyGift = new Gift<Toy>(toy, occasion);
            }
            else if (c1 == 3)
            {
                System.out.println("Enter the name of the animal: ");
                String name = sc.next();
                System.out.println("Enter the age of the animal: ");
                int age = sc.nextInt();
                animal = new Animal(name, age);
                System.out.println("Enter the occasion: ");
                String occasion = sc.next();
                animalGift = new Gift<Animal>(animal, occasion);
            }
            else if (c1 == 4)
            {
                break;
            }
        }
    }
}