// Practical-4: Write a Java Program to demonstrate Nested If Statement.
import java.util.Scanner;

public class NestedIfExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if (marks >= 20) {
            if (marks >= 80) {
                System.out.println("You Pass");
            } else {
                System.out.println("Your marks is below the passing marks, You Fail");
            }
        } else {
            System.out.println("Fail");
        }
    }
}

/* Output:
Enter your marks: 85
You Pass
*/
