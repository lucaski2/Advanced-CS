
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

    

}