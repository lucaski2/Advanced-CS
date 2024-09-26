
public class Runner
{
    public static void main(String[] args)
    {
        Profile p = new Profile("John");
        System.out.println(p.saying());
        Student s = new Student("Jane");
        System.out.println(s.saying());
    }
}