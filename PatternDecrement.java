// Practical-12: Write a Java Program to print Decreasing Order Number Pattern using for loop.
import java.util.Scanner;

public class PatternDecrement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/* Output:
Enter number: 4
1234
123
12
1
*/
