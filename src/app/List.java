package app;

/**
 * List
 */
public class List {

    private Node start; // Puntero
    private int length; // Guardará el tamaño de la lista

    public List() {
        start = null;
        length = 0;
    }

    // Metodos de incersión:
    public void addStart (Object value) {
        Node node = new Node(value);
        node.next = start;
        start = node;
        length++;
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
        length++;
    }

    // Método de obtención:
    public Object getValue (int n) {
        if (start == null) {
            return null;
        } else {
            Node pointer = start;
            int counter = 0;
            while (counter < n && pointer.next != null) {
                pointer = pointer.next;
                counter++;
            }

            if (counter != n) {
                return null;
            } else {
                return pointer.value;
            }
        }
    }

    // Obtener la longitud de la lista
    public int getLength () {
        return length;
    }

    // Metodos de eliminación:
    
}
