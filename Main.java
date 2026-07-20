import java.util.*;
class MyClass {
    // Instance variable
    int instanceVariable = 10;

    // Static variable
    static int staticVariable = 20;

    // Public static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable: " + staticVariable);
        // Cannot directly access instanceVariable here
    }

    // Public instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Static variable: " + staticVariable); // Can access static members
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling a static method directly using the class name
        MyClass.staticMethod();

        // Creating an object to call an instance method
        MyClass obj = new MyClass();
        obj.instanceMethod();
    }
}
