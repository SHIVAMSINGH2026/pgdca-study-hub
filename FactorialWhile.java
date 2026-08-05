// Practical-15: Write a Java Program to find Factorial of a number using While Loop.
public class FactorialWhile {
    public static void main(String args[]) {
        int num = 5;
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial: " + fact);
    }
}

/* Output:
Factorial: 120
*/
