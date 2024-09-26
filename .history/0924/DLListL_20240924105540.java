
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
        Node<E> newNode = new Node<E>(data);
        Node<E> temp = tail.getPrev();
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.setNext(tail);
        tail.setPrev(newNode);
        size++;
    }


}