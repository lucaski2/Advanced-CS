
public class Runner
{
    public static void main(String[] args) {
        SLList<Integer> list = new SLList<Integer>();
        for (int i = 0; i < 100; i++)
        {
            list.add(Math.random() * 100, (int)(Math.random() * (i + 1)));
        }
    }
}