
public class Runner
{
    public static void main(String[] args) {
        
        // Instantiate a node called Head and have data be null.   
        // (e.g.  Node<String> head = new Node<String>(null); )
        // Instantiate a node called Tail and have data be null.  
        // Create 5 Nodes of Strings with Animal names as follows… (cow, cat, dog, bird, and bear).
        // Connect each node to the head and tail nodes in the order given above. You will need to use setNext and setPrev for each node.  For example:
        // head.setNext( cow );
        // cow.setPrev( head );
        // etc…

        // In a loop, cycle through and print the data of each node forward starting from the head

        // In another loop, cycle through and print the data of each node backward starting from the tail.

        // Ask the user for an animal name, and add that node to the end.

        // In a loop, cycle through and print the data of each node forward starting from the head

        Node<String> head = new Node<String>(null);
        Node<String> tail = new Node<String>(null);

        Node<String> cow = new Node<String>("cow");
        Node<String> cat = new Node<String>("cat");
        Node<String> dog = new Node<String>("dog");
        
        head.setNext(cow);
        cow.setPrevious(head);
        cow.setNext(cat);
        cat.setPrevious(cow);
        cat.setNext(dog);
        dog.setPrevious(cat);
        dog.setNext(tail);
        tail.setPrevious(dog);

        Node<String> current = head.getNext();
        

    }
}