package app;

public class App {
    public static void main(String[] args) {
        List l = new List();
        User user = new User("JD", 123);
        User user2 = new User("Danel", 1234);
        
        l.addStart("Java");
        l.addFinish(user);
        l.addFinish("Python");
        l.addFinish(user2);
        
        // l.deleteFinish();
        // l.deleteStart();
        // l.deleteForCounter(0);
        // int length = l.getLength();

        l.modifyNode(0, "Javascript");
        Object object = l.getValue(0);
        System.out.println(object);
        
        // for (int i = 0; i < length; i++) {
        //     Object object = l.getValue(i);
        //     if (object.equals("JD")) {
        //         System.out.println("Hola");
        //     }
        // }

    }
}
