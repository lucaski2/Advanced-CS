
public class Gift<T> {
    private T item;

    public Gift(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}