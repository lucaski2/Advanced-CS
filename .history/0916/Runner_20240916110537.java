public class Runner {
    public static void main(String[] args) {
        // Step 1: Create nodes
        Node n1 = new Node("cat");
        Node n2 = new Node("dog");
        Node n3 = new Node("bird");
        Node n4 = new Node("bear");
        Node n5 = new Node("pig");

        // Step 2: Link nodes
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(null); // This is implicit as 'next' is initialized to null

        Node start = n1;

        Node current = start;
        while (current != null) {
            System.out.println(current.get());
            current = current.next();
        }
    }
}