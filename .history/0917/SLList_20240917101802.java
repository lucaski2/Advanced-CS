
public class SLList<E>
{
    public class Node
    {
        private E data;
        private Node next;

        public Node(E data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public E get()
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
}