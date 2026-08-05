// Practical-44: Write a Java Program to demonstrate Single Inheritance and use Arithmetic inside nested loop format.
public class Add {
    int a = 1;
}

class Subtract extends Add {
    int b = 5;

    void display() {
        System.out.println("No of value B :- " + b);
    }
}

class Result {
    public static void main(String[] args) {
        Subtract obj = new Subtract();
        int sum = obj.a + obj.b;
        System.out.println("Sum of a and b :- " + sum);

        // Nested loop to print numbers in increasing pattern
        for (int c = obj.a; c <= sum; c++) {
            for (int d = obj.a; d <= c; d++) {
                System.out.print(d);
            }
            System.out.println();
        }
    }
}

/* Output:
Sum of a and b :- 6
1
12
123
1234
12345
123456
*/
