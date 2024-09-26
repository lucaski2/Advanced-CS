
public class Runner
{
    public static void main(String[] args) {
        SLList<Integer> list = new SLList<Integer>();
        for (int i = 0; i < 100; i++)
        {
            list.add((int)(Math.random() * 98 + 1), (int)(Math.random() * i));
        }
        System.out.println(list);
        list.sort();
        System.out.println(list);

        

    }
}