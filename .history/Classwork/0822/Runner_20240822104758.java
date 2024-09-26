
public class Runner
{
    public static void main(String[] args)
    {
        Profile s = new Student("John");
        System.out.println(s.saying());
        s = (Profile) (s);
        System.out.println(s.saying());
    }
}