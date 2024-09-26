
public class Gift<T> {
    private T item;
    private T

    public Gift(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}