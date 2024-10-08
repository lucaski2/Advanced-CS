
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
        return s;
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

    public boolean remove(E data)
    {
        if (head == null)
            return false;
        if (head.get().equals(data))
        {
            head = head.next();
            return true;
        }
        Node<E> current = head;
        while (current.next() != null)
        {
            if (current.next().get().equals(data))
            {
                current.setNext(current.next().next());
                return true;
            }
            current = current.next();
        }
        return false;
    }

    public int size()
    {
        int count = 0;
        Node<E> current = head;
        while (current != null)
        {
            count++;
            current = current.next();
        }
        return count;
    }

    public void set(E data, int index)
    {
        Node<E> current = head;
        for (int i = 0; i < index; i++)
        {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.next();
        }
        if (current == null)
            throw new IndexOutOfBoundsException();
        current.set(data);
    }



    public void sort()
    {
        int length = size();
        for (int i = 0; i < length - 1; i++)
        {
            Node<E> current = head;
            for (int j = 0; j < length - i - 1; j++)
            {
                String name1 = ((Student)current.get()).getName();
                String name2 = ((Student)current.next().get()).getName();
                if (name1.compareTo(name2) > 0)
                {
                    E temp = current.get();
                    current.set(current.next().get());
                    current.next().set(temp);
                }
                current = current.next();
            }
        }
    }

    public void scramble()
    {
        for (Node<E> i = head; i != null; i = i.next())
        {
            int index = (int)(Math.random() * size());
            Node<E> j = head;
            for (int k = 0; k < index; k++)
                j = j.next();
            E temp = i.get();
            i.set(j.get());
            j.set(temp);
        }
    }
}