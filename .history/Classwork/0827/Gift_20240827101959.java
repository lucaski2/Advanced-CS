
public class Gift<T> {
    private T item;
    private String name;

    public Gift(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}