package app;

public class App {
    public static void main(String[] args) {
        List l = new List();
        l.addStart("Hola");
        l.addFinish("Adios");
        Object object = l.getValue(0);
        System.out.println(l.getLength());
    }
}
