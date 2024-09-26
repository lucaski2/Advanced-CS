
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
        
    }
}