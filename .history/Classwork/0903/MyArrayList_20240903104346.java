
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
            for (int i = 0; i < size; i++)
            {
                temp[i] = list[i];
            }
            temp[size] = element;
            list = temp;
        }
        else
        {
            list[size] = element;
        }
    }
    
    public boolean add(Element E, int location){
        if(location > size){
            
        }
    }

    public E get(int index)
    {
        if (index < 0 || index >= size)
        {
            
        }
    }
}