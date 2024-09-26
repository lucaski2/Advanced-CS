import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Runner{
    public static void main(String[] args) {
        MyArrayList< list =
        try {
			Scanner sc = new Scanner(new FileReader("names.txt"));
			
			//reads one word at a time
			while (sc.hasNext()){
			   System.out.println(sc.next());
			}
			System.out.println();
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } 



    }
}