// Practical-48: Write a Java Program to demonstrate Interface with all type methods.
interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("This is a default method in Interface");
    }

    static void staticMethod() {
        System.out.println("This is a static method in Interface");
    }

    private void privateMethod() {
        System.out.println("This is a private method in Interface");
    }

    default void callPrivateMethod() {
        privateMethod();
    }
}

class ImplementClass implements MyInterface {
    public void abstractMethod() {
        System.out.println("This is the implementation of abstract method");
    }
}

public class Main {
    public static void main(String[] args) {
        ImplementClass obj = new ImplementClass();
        obj.abstractMethod();
        obj.defaultMethod();
        obj.callPrivateMethod();
        MyInterface.staticMethod();
    }
}

/* Output:
This is the implementation of abstract method
This is a default method in Interface
This is a private method in Interface
This is a static method in Interface
*/
