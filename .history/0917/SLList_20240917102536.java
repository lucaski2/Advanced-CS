
public class SLList<E>
{
    private Node<E> head;
    public SLList()
    {
        head = null;
    }

    public E get()
    {
        return head.get();
    }

    public void add(E data)
    {
        head = new Node<E>(data, head);
    }

    public String toString()
    {
        String s = "[";
        Node<E> current = head;
        while (current != null)
        {
            s += current.get();
            current = current.next();
            if (current != null)
                s += ", ";
        }
        s += "]";
    }

    public void add(E data, int index)
    {
        if (index == 0)
        {
            head = new Node<E>(data, head);
            return;
        }
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++)
        {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.next();
        }
        if (current == null)
            throw new IndexOutOfBoundsException();
        current.setNext(new Node<E>(data, current.next()));
    }

    public E remove(int index)
    {
        if (index == 0)
        {
            if (head == null)
                throw new IndexOutOfBoundsException();
            E data = head.get();
            head = head.next();
            return data;
        }
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++)
        {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.next();
        }
        if (current == null || current.next() == null)
            throw new IndexOutOfBoundsException();
        E data = current.next().get();
        current.setNext(current.next().next());
        return data;
    }

    
}