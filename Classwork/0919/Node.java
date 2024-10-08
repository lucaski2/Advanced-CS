
public class Node<E>
{
    private E data;
    private Node<E> next;

    public Node(E data, Node<E> next)
    {
        this.data = data;
        this.next = next;
    }

    public E get()
    {
        return data;
    }
    public Node<E> next()
    {
        return next;
    }
    public void setNext(Node<E> next)
    {
        this.next = next;
    }
    public void set(E data)
    {
        this.data = data;
    }
}