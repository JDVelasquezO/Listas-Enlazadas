package app;

public class App {
    public static void main(String[] args) {
        List l = new List();
        l.addStart("Hola");
        l.addStart("Adios");
        Object object = l.getValue(1);
        System.out.println(object);
    }
}
