
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
            
        }
    }
}