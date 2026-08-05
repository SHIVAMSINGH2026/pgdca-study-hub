// Practical-13: Write a Java Program to print numbers from 1 to 5 using While Loop.
import java.util.Scanner;

public class WhileNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
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
