
public class MyArrayList<E>
{
    private Object[] list;
    private int size;
    private int capacity;

    public MyArrayList()
    {
        capacity = 10;
        list = new Object[capacity];
        size = 0;
    }

    public void add(E element)
    {
        if (size == capacity)
        {
            capacity *= 2;
            Object[] temp = new Object[capacity];
            
        }
    }
    
    public boolean add(Element E, ){
        
    }
}