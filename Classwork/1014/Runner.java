// import java.util.ArrayList;
import java.util.Scanner;
public class Runner
{
    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();
        Stack<String> s = new Stack<String>();
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            String line = sc.nextLine();
            String[] words = line.split(" ");

            for (String word : words)
            {
                q.push(word);
                s.push(word);
                // System.out.println(word);
            }
            
            boolean ok = true;
            while (!q.isEmpty())
            {
                if (q.peek().equals(s.peek()))
                {
                    q.pop();
                    s.pop();
                    continue;
                }
                else
                {
                    ok = false;
                    break;
                }
            }
            if (ok)
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not a palindrome");
            }
        }
    }
}