
public class Node
{
    private String data;
    private Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    public int get()
    {
        return data;
    }


    public Node next()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
