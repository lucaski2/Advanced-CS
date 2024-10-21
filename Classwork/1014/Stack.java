
public class Stack<E>
{
    DLList<E> stack;
    public Stack()
    {
        stack = new DLList<E>();
    }

    public E push(E data)
    {
        stack.add(data);
        return data;
    }

    public E pop()
    {
        if (stack.size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        E temp = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return temp;
    }

    public E peek()
    {
        if (stack.size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        return stack.get(stack.size() - 1);
    }

    public int size()
    {
        return stack.size();
    }

    public boolean isEmpty()
    {
        return stack.size() == 0;
    }
}