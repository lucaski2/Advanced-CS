import java.util.ArrayList;

public class Warmup
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            numbers.add((int)(Math.random() * 988 + 1));
        }
        System.out.println(numbers);
    }
}