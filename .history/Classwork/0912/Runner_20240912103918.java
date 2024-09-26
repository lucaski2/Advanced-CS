import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Runner{
    public static void main(String[] args) {
        try {
			Scanner sc = new Scanner(new FileReader("names.txt"));
			
			//reads one word at a time
			while (sc.hasNext()){
			   System.out.println(sc.next());
			}
			System.out.println();
			
			//reads one line at a time
			scan = new Scanner(new FileReader("info.txt"));
			while (scan.hasNextLine()){
			   System.out.println( scan.nextLine() );
			}
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}