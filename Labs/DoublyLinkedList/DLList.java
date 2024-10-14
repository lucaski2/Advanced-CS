
public class DLList<E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DLList()
    {
        head = new Node<E>(null);
        tail = new Node<E>(null);
        head.setNext(tail);
        tail.setPrev(head);
        size = 0;
    }

    public boolean add(E data)
    {
        Node<E> newNode = new Node<E>(data);
        Node<E> temp = tail.getPrev();
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.setNext(tail);
        tail.setPrev(newNode);
        size++;
        return true;
    }

    public void add(int ind, E data)
    {
        if (ind < 0 || ind > size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<E> newNode = new Node<E>(data);
        Node<E> temp = head;
        for (int i = 0; i < ind; i++)
        {
            temp = temp.getNext();
        }
        Node<E> temp2 = temp.getNext();
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.setNext(temp2);
        temp2.setPrev(newNode);
        size++;
    }

    public E get(int ind)
    {
        if (ind < 0 || ind >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<E> temp = head.getNext();
        for (int i = 0; i < ind; i++)
        {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public E remove(int ind)
    {
        if (ind < 0 || ind >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<E> temp = head;
        for (int i = 0; i < ind; i++)
        {
            temp = temp.getNext();
        }
        Node<E> temp2 = temp.getNext();
        Node<E> temp3 = temp2.getNext();
        temp.setNext(temp3);
        temp3.setPrev(temp);
        size--;
        return temp2.getData();
    }

    public int size()
    {
        return size;
    }

    public E set(int ind, E val)
    {
        if (ind < 0 || ind >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<E> temp = head.getNext();
        for (int i = 0; i < ind; i++)
        {
            temp = temp.getNext();
        }
        E old = temp.getData();
        temp.setData(val);
        return old;
    }

    public String toString()
    {
        String str = "[";
        Node<E> temp = head.getNext();
        for (int i = 0; i < size; i++)
        {
            str += temp.getData();
            if (i < size - 1)
            {
                str += ", ";
            }
            temp = temp.getNext();
        }
        str += "]";
        return str;
    }
}