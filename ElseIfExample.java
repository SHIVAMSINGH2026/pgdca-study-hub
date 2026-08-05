// Practical-3: Write a Java Program to demonstrate Else-If Ladder.
import java.util.Scanner;

public class ElseIfExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("YOU FAIL");
        }
    }
}

/* Output:
Enter your marks: 75
Grade C
*/
