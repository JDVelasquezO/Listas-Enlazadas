package app;

public class App {
    public static void main(String[] args) {
        List l = new List();
        
        l.addStart("Java");
        l.addFinish("Python");
        l.addFinish("Vue");
        l.addFinish("Angular");
        
        l.deleteFinish();
        l.deleteStart();
        l.deleteForCounter(0);
        
        Object object = l.getValue(0);
        // int length = l.getLength();
        System.out.println(object);
    }
}
