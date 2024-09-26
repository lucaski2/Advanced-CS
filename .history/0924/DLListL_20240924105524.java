
public class DLListL<E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DLListL()
    {
        head = new Node<E>(null);
        tail = new Node<E>(null);
        head.setNext(tail);
        tail.setPrev(head);
        size = 0;
    }

    public boolean add(E data)
    {
        
    }


}