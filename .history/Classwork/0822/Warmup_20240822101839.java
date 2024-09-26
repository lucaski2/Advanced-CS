import java.util.ArrayList;

public class Warmup
{
    public static void main(String[] args) {
        Item arr[] = {new Item("apple", 1), new Item("banana", 2), new Item("carrot", 3), new Item("date", 4)};
        ArrayList<Item> list = new ArrayList<Item>();
        for (Item i : arr) {
            list.add(i);
        }


    }
}

