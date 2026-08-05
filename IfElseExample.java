// Practical-2: Write a Java Program to demonstrate If-Else Statement.
import java.util.Scanner;

public class IfElseExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 20) {
            System.out.println("You can drive car");
        } else {
            System.out.println("You are not able to drive the car");
        }
    }
}

/* Output:
Enter your age: 18
You are not able to drive the car
*/
