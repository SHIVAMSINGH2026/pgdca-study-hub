// Practical-40: Write a Java Program to demonstrate Constructor Overloading using Arithmetic Operations.
public class Arithmetic {
    int a, b;

    // Default Constructor
    Arithmetic() {
        a = 10;
        b = 5;
        System.out.println("Default Constructor Called");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("========================================");
    }

    // Parameterized Constructor with two integers
    Arithmetic(int x, int y) {
        a = x;
        b = y;
        System.out.println("Parameterized Constructor Called with values: " + a + ", " + b);
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("=======================================");
    }

    // Parameterized Constructor with one integer (square calculation)
    Arithmetic(int x) {
        a = x;
        System.out.println("Single Parameter Constructor Called with value: " + a);
        System.out.println("Square = " + (a * a));
        System.out.println("Cube = " + (a * a * a));
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        // Call default constructor
        Arithmetic obj1 = new Arithmetic();

        // Call parameterized constructor with two values
        Arithmetic obj2 = new Arithmetic(20, 4);

        // Call parameterized constructor with one value
        Arithmetic obj3 = new Arithmetic(7);
    }
}

/* Output:
Default Constructor Called
Addition = 15
Subtraction = 5
Multiplication = 50
Division = 2
==========================================
Parameterized Constructor Called with values: 20, 4
Addition = 24
Subtraction = 16
Multiplication = 80
Division = 5
==========================================
Single Parameter Constructor Called with value: 7
Square = 49
Cube = 343
==========================================
*/
