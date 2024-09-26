import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Random;
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
        Scanner sc = new Scanner(System.in);
        outer:
        while (true){
            System.out.println("1. Display the list.\n2. Scramble the list.\n3. Apply the BubbleSort (O(n^2)) to the list.\n4. Apply the MergeSort (O(n log n) to the list) or Apply the QuickSort (O(n log n) to the list).\n5. Quit");
            int c1 = sc.nextInt();
            if (c1 == 1)
            {
                System.out.println(sort);
            }
            else if (c1 == 2)
            {
                sort.scramble();
            }
            else if (c1 == 3)
            {
                sort.bubbleSort();
            }
            else if (c1 == 4)
            {
                sort.mergeSort(0, sort.lst.size() - 1);
            }
            else if (c1 == 5)
            {
                break;
            }
            // switch (c1){
            //     case 1:
            //         System.out.println(sort);
            //         break;
            //     case 2:
            //         sort.scramble();
            //         break;
            //     case 3:
            //         sort.bubbleSort();
            //         break;
            //     case 4:
            //         sort.mergeSort(0, sort.lst.size() - 1);
            //         break;
            //     case 5:
            //         break outer;
            //         break;
            // }
        }

    }
}