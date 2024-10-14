public class Runner
{
    public static void main(String[] args) {
        DLList<Integer> list = new DLList<Integer>();
        
        for (int i = 0; i < 1000; i++)
        {
            list.add((int)(Math.random() * 1000));
        }

        for (int i = 0; i < 1000; i++)
        {
            System.out.println(list.remove((int)(Math.random() * list.size())));
        }

        System.out.println(list.size());

    }
}