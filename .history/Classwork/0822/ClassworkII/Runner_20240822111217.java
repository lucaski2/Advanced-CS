
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
            System.out.println(french.getLanguage());
            System.out.println(french.getAuthor());
        } else if (language.equalsIgnoreCase("English")) {
            System.out.println(english.getHello());
            System.out.println(english.getBye());
            System.out.println(english.getLanguage());
            System.out.println(english.getAuthor());
        } else if (language.equalsIgnoreCase("Spanish")) {
            System.out.println(spanish.getHello());
            System.out.println(spanish.getBye());
            System.out.println(spanish.getLanguage());
            System.out.println(spanish.getAuthor());
        } else if (language.equalsIgnoreCase("Japanese")) {
            System.out.println(japanese.getHello());
            System.out.println(japanese.getBye());
            System.out.println(japanese.getLanguage());
            System.out.println(japanese.getAuthor());
        } else {
            System.out.println("Invalid language.");
        }
    }
}