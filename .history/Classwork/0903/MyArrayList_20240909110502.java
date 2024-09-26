
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

    public boolean add(E element)
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
        size += 1;
        return true;
    }
    
    public void add(E element, int location){
        if(location > size || location < 0){
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity)
        {
            capacity *= 2;
            Object[] temp = new Object[capacity];
            for (int i = 0; i < size; i++)
            {
                temp[i] = list[i];
            }
            list = temp;
        }
        if (location == size)
        {
            add(element);
        } else {
            for (int i = size; i > location; i--)
            {
                list[i] = list[i - 1];
            }
            list[location] = element;
        }
        size += 1;
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
        
    }

    public E remove(E element)
    {
        for (int i = 0; i < size; i++)
        {
            if (list[i].equals(element))
            {
                return remove(i);
            }
        }
        return null;
    }

    public void set(E element, int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        list[index] = element;
    }

    public int size()
    {
        return size;
    }

    public String toString()
    {
        String ret = "[";
        for (int i = 0; i < size; i++)
        {
            ret += list[i];
            if (i != size - 1)
            {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    
}