
public class Node<E>
{
    private E data;
    private Node<E> next;
    private Node<E> previous;

    public Node(E data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    
}