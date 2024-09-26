import java.util.ArrayList;

public class Warmup
{
    public static void main(String[] args) {
        Item arr[] = {new Item("apple", 1), new Item("banana", 2), new Item("carrot", 3), new Item("date", 4)};
        ArrayList<Item> list = new ArrayList<Item>();
        for (Item i : arr) {
            list.add(i);
        }
        Item twod[][] = new Item[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                twod[i][j] = list.get(i * 2 + j);
            }
        }
        // print all 3 arrays
        for (Item i : arr) {
            System.out.println(i);
        }
        for (Item i : list) {
            System.out.println(i);
        }
        for (Item i[] : twod) {
            for (Item j : i) {
                System.out.println(j);
            }
        }


    }
}

