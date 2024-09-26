
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
    
}