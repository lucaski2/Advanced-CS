
public class LinkedList<E>
{
    public Node<E> head;
    public Node<E> tail;
    public int size;

    public LinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(E data)
    {
        Node<E> newNode = new Node<E>(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    


}