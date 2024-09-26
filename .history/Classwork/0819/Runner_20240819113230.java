public class Runner
{
    public static void main(String[] args) {
        Profile profiles[] = new Profile[10];
        String names[] = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isaac", "Jenny"};
        int ages[] = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = (int)(Math.random() * 100);
            profiles[i] = new Profile(names[i], ages[i]);
        }

        while (true)
        {
            System.out.println("Names: ")
        }


    }
}