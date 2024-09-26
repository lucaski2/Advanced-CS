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
            
        }
    }
}