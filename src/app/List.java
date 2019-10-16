package app;

/**
 * List
 */
public class List {

    private Node start; // Punteros

    public List() {
        start = null;
    }

    public void addStart (Object value) {
        Node node = new Node(value);
        node.next = start;
        start = node;
    }

    public void addFinish (Object value) {
        Node node = new Node(value);
        if (start == null) {
            start = node;
        } else {
            Node pointer = start;
            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = node;
        }
    }
}
