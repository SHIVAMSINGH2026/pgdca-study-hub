// Practical-5: Write a Java Program to print numbers from 1 to n using For Loop.
import java.util.Scanner;

public class ForLoopNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

/* Output:
Enter n: 5
1
2
3
4
5
*/
