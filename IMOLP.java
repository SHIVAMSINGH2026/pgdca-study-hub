// Practical-33: Write a Java Program to demonstrate Instance Method Overloading.
public class IMOLP {
    int a, b, c, d;

    int add(int a) {
        return a;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    float add(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        IMOLP S = new IMOLP();
        System.out.println("One digit parameter: " + S.add(12));
        System.out.println("Sum of two parameters: " + S.add(10, 12));
        System.out.println("Sum of three parameters: " + S.add(10, 12, 32));
        System.out.println("Sum of four parameters: " + S.add(10, 111, 12, 32));
        System.out.println("Division of two float parameters: " + S.add(19f, 3f));
    }
}

/* Output:
One digit parameter: 12
Sum of two parameters: 22
Sum of three parameters: 54
Sum of four parameters: 165
Division of two float parameters: 6.3333335
*/
