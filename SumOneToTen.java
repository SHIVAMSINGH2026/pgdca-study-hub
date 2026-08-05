// Practical-30: Write a Java Program to find the Sum of Numbers from 1 to 10 using While Loop.
public class SumOneToTen {
    public static void main(String args[]) {
        int L = 1;
        int Sum = 0;
        while (L <= 10) {
            Sum = Sum + L;
            L++;
        }
        System.out.println("Sum of numbers from 1 to 10 = " + Sum);
    }
}

/* Output:
Sum of numbers from 1 to 10 = 55
*/
