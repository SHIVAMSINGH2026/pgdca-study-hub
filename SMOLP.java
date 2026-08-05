// Practical-34: Write a Java Program to demonstrate Static Method Overloading.
public class SMOLP {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static float add(float a, float b) {
        return a / b;
    }

    static float add(float a, float b, float c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two parameters: " + SMOLP.add(12, 11));
        System.out.println("Sum of three parameters: " + SMOLP.add(11, 12, 13));
        System.out.println("Sum of four parameters: " + SMOLP.add(23, 2, 1, 1));
        System.out.println("Division of two float parameters: " + SMOLP.add(19f, 3f));
        System.out.println("Multiplication of three float parameters: " + SMOLP.add(20f, 3f, 2f));
    }
}

/* Output:
Sum of two parameters: 23
Sum of three parameters: 36
Sum of four parameters: 27
Division of two float parameters: 6.3333335
Multiplication of three float parameters: 120.0
*/
