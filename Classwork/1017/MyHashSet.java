
public class MyHashSet<E>
{
    private Object[] hashTable;
    private int size;
    public MyHashSet()
    {
        hashTable = new Object[650];
        size = 0;
    }



    public boolean add(E e)
    {
        int ind = e.hashCode();

        hashTable[ind] = (Object)e;
        size++;
        return true;
    }
    public void clear()
    {
        hashTable = new Object[650];
    }
    public boolean contain(Object o)
    {
        int ind = o.hashCode();
        if (hashTable[ind] == null)
        {
            return false;
        }
        return true;
    }
    public boolean remove(Object o)
    {
        int ind = o.hashCode();
        if (hashTable[ind] == null)
        {
            return false;
        }
        hashTable[ind] = null;
        size--;
        return true;
    }
    
    public int size()
    {
        return size;
    }
    public DLList<E> toDLList()
    {   
        DLList<E> list = new DLList<E>();
        for(int i = 0;i < hashTable.length;i++){
            if(hashTable[i] != null){
                list.add((E)hashTable[i]);
            }
        }
        return list;
    }
}