
public class MyArrayList<T>
{
    private Object[] array;
    private int size;
    private int capacity;

    public MyArrayList()
    {
        capacity = 10;
        size = 0;
        array = (T[]) new Object[capacity];
    }

    

}