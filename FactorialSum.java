// Practical-28: Write a Java Program to find the Sum of Factorials from 1! to 5 using While Loop.
public class FactorialSum {
    public static void main(String args[]) {
        int n = 5;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            int fact = 1;
            int j = 1;
            while (j <= i) {
                fact = fact * j;
                j++;
            }
            sum = sum + fact;
            i++;
        }
        System.out.println("Sum of factorials from 1! to 5 = " + sum);
    }
}

/* Output:
Sum of factorials from 1! to 5 = 153
*/
