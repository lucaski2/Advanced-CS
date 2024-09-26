
public class Warmup
{
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 98 + 1);
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "" ');
        }
        System.out.println();
    }
}