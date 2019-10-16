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
    // Al inicio
    public void addStart (Object value) {
        Node node = new Node(value);
        node.next = start;
        start = node;
        length++;
    }

    // Al final
    public void addFinish (Object value) {
        Node node = new Node(value);
        if (isEmpty()) {
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
        if (isEmpty()) {
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

    // Saber si la lista está vacía o no
    public boolean isEmpty () {
        return start == null;
    }

    // Metodos de eliminación:
    // Al inicio
    public void deleteStart () {
        if (!isEmpty()) {
            Node first = start;
            start = start.next;
            first.next = null;
            length--;
        }
    }

    // Al final
    public void deleteFinish () {
        if (!isEmpty()) {
            if (start.next == null) {
                start = null;
            } else {
                Node pointer = start;
    
                while (pointer.next.next != null) {
                    pointer = pointer.next;
                }
    
                pointer.next = null;
            }

            length--;
        }
    }

    // Eliminar uno en concreto:
    public void deleteForCounter (int n) {
        if (!isEmpty()) {
            if (n == 0) {
                Node first = start;
                start = start.next;
                first.next = null;
            } else if (n < length) {
                Node pointer = start;
                int counter = 0;
                while (counter < (n-1)) {
                    pointer = pointer.next;
                    counter++;
                }
                
                Node temp = pointer.next; // Obtenemos la posición en concreto
                pointer.next = temp.next; // La igualamos a su siguiente
                temp.next = null; // Eliminamos el nodo en concreto
            }
            length--;
        }
    }
}
