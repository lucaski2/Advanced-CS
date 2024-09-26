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
            System.out.println("1. Display the list.\n2. Scramble the list.\n3. Apply the BubbleSort (O(n^2)) to the list.\n4. Apply the MergeSort (O(n log n) to the list) or Apply the QuickSort (O(n log n) to the list).\n")
        }

    }
}