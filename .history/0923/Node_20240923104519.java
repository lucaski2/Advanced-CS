
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

    public E getData()
    {
        return data;
    }

    public void setData(E data)
    {
        this.data = data;
    }

    public Node<E> getNext()
    {
        return next;
    }

    public void setNext(Node<E> next)
    {
        this.next = next;
    }
    
}