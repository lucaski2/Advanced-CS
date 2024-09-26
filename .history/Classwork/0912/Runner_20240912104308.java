import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Runner{
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        try {
			Scanner sc = new Scanner(new FileReader("names.txt"));
			//reads one word at a time
			while (sc.hasNext()){
			   lst.add(sc.next());
			}
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } 

        System.out.println(list);

    }
}