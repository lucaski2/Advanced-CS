import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Runner{
    public static void main(String[] args) {
        Sort sort = new Sort();
        try {
			Scanner sc = new Scanner(new FileReader("names.txt"));
			//reads one word at a time
			while (sc.hasNext()){
			   sort.lst.add(sc.next());
			}
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } 

        while (true){
            System.out.println("1. Display the list.\n2. ")
        }

    }
}