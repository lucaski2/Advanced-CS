
import java.util.Scanner;
public class Runner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Language english = new English();
        Language japanese = new Japanese();
        Language french = new French();
        Language spanish = new Spanish();
        System.out.print("Select a language: French, English, Spanish, or Japanese: ");
        String language = sc.nextLine();

        if (language.equalsIgnoreCase("French")) {
            System.out.println(french.getHello());
            System.out.println(french.getBye());
            System.out
    }
}