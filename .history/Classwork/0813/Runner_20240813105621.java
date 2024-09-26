import java.util.Scanner;

public class Runner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter type of animal: ");
        String type = sc.nextLine();
        System.out.print("Please enter age of animal: ");
        int age = sc.nextInt();
        System.out.print("Please enter name of animal: ");
        String name = sc.nextLine();
        Animal a = new Animal(type, age, name);
        System.out.println();

    }
}

