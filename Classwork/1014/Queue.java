public class Queue<E>{
    private DLList<E> myQueue;
    public Queue(){
        myQueue = new DLList<E>();
    }

    public E push(E data)
    {
        myQueue.add(data);
        return data;
    }

    public E pop()
    {
        if (myQueue.size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        E temp = myQueue.get(0);
        myQueue.remove(0);
        return temp;
    }

    public E peek()
    {
        if (myQueue.size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        return myQueue.get(0);
    }

    public E poll()
    {
        if (myQueue.size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        E temp = myQueue.get(0);
        myQueue.remove(0);
        return temp;
    }

    public int size()
    {
        return myQueue.size();
    }

    public boolean isEmpty()
    {
        return myQueue.size() == 0;
    }
}