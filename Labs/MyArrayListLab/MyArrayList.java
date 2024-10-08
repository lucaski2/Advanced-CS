
public class MyArrayList<T>
{
    private Object[] array;
    private int size;
    private int capacity;

    public MyArrayList()
    {
        capacity = 10;
        size = 0;
        array = new Object[capacity];
    }

    public boolean add(T element)
    {
        if (size == capacity)
        {
            capacity *= 2;
            Object[] temp = new Object[capacity];
            for (int i = 0; i < size; i++)
            {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size] = element;
        size++;
        return true;
    }

    public void add(T element, int index)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity)
        {
            capacity *= 2;
            Object[] temp = new Object[capacity];
            for (int i = 0; i < size; i++)
            {
                temp[i] = array[i];
            }
            array = temp;
        }
        for (int i = size; i > index; i--)
        {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public T get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    } 

    public T remove(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        T element = (T) array[index];
        for (int i = index; i < size - 1; i++)
        {
            array[i] = array[i + 1];
        }
        size--;
        return element;
    }

    public T remove(T element)
    {
        for (int i = 0; i < size; i++)
        {
            if (array[i].equals(element))
            {
                return remove(i);
            }
        }
        return null;
    }

    public void set(int index, T element)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
    }

    public Object[] toArray()
    {
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++)
        {
            temp[i] = array[i];
        }
        return temp;
    }

    public int size()
    {
        return size;
    }

    public String toString()
    {
        String result = "[";
        for (int i = 0; i < size; i++)
        {
            result += array[i].toString();
            if (i < size - 1)
            {
                result += ", ";
            }
        }
        return result + "]";
    }
}