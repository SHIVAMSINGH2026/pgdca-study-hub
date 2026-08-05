// Practical-10: Write a Java Program to print multiple tables in decreasing order using Nested For Loop.
import java.util.Scanner;

public class TableDecreasing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 20; i <= num; i++) {
            for (int j = 10; j >= 1; j--) {
                System.out.println(i * j);
            }
            System.out.println();
        }
    }
}

/* Output:
Enter number: 30
200 180 160 140 120 100 80 60 40 20
... (tables 20 to 30 in decreasing order)
*/
