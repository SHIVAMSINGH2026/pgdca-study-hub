// Practical-11: Write a Java Program to print number pattern using For Loop.
import java.util.Scanner;

public class PatternIncrement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/* Output:
Enter number: 4
1
12
123
1234
*/
