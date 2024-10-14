
public class DLList<E>
{
    int size;
    Node<E> head;
    Node<E> tail;

    public DLList()
    {
        head = new Node<E>(null);
        tail = new Node<E>(null);
        head.setNext(tail);
        tail.setPrev(head);
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public E get(int index)
    {
        Node<E> cur = head.next();

        for (int i = 0; i < index; i++)
        {
            cur = cur.next();
        }

        return cur.get();
    }

    public boolean add(E value)
    {
        Node<E> temp = tail.prev();
        Node<E> inserted = new Node<E>(value);

        temp.setNext(inserted);
        inserted.setPrev(temp);
        inserted.setNext(tail);
        tail.setPrev(inserted);
        size++;
        return true;
    }

    public E remove(int index)
    {
        Node<E> removing = head.next();

        for (int i = 0; i < index; i++)
        {
            removing = removing.next();
        }

        Node<E> previous = removing.prev();
        Node<E> next = removing.next();

        previous.setNext(next);
        next.setPrev(previous);
        size--;
        return removing.get();
    }
    

}