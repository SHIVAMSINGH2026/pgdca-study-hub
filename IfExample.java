// Practical-1: Write a Java Program to demonstrate If Statement.
import java.util.Scanner;

public class IfExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can drive car");
        }
    }
}

/* Output:
Enter your age: 20
You can drive car
*/
