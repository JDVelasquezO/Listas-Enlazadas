package app;

public class App {
    public static void main(String[] args) {
        List l = new List();
        l.addStart("Java");
        l.addFinish("Python");
        l.addFinish("Vue");
        l.deleteForCounter(0);
        Object object = l.getValue(1);
        System.out.println(object);
    }
}
