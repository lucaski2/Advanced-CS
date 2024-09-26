
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

    public void add(int index, E data)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> newNode = new Node<E>(data);
        if (index == 0)
        {
            newNode.next = head;
            head = newNode;
            if (size == 0)
            {
                tail = newNode;
            }
        }
        else if (index == size)
        {
            tail.next = newNode;
            tail = newNode;
        }
        else
        // {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    


}