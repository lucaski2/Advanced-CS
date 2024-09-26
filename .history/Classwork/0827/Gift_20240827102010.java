
public class Gift<T> {
    private T item;
    private String name;

    public Gift(T item, String name) {
        this.item = item;
        this.name = name;
    }

    public T getItem() {
        return item;
    }
    
}