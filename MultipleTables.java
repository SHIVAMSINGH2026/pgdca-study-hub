// Practical-9: Write a Java Program to print multiple tables from 20 to 30 using Nested For Loop.
import java.util.Scanner;

public class MultipleTables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number above 20: ");
        int num = sc.nextInt();
        for (int i = 20; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i * j);
            }
            System.out.println();
        }
    }
}

/* Output:
Enter number above 20: 30
20 40 60 80 100 120 140 160 180 200
... (tables 20 to 30 printed similarly)
*/
