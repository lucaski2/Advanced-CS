
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
    
    public boolean add(E element, int location){
        if(location > size || location < 0){
            throw new IndexOutOfBoundsException();
        }
        if (location == size)
        {
            add(E);
        } else if ()
    }

    public E get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        return (E) list[index];
    }

    public E remove(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        E ret = (E) list[index];
        for (int i = index; i < size - 1; i++)
        {
            list[i] = list[i + 1];
        }
        size -= 1;
        return ret;
    }

    public 
    
}