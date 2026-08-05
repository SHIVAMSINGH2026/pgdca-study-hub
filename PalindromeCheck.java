// Practical-29: Write a Java Program to check whether a given number is Palindrome or Not (using While Loop).
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (original == rev) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is NOT a Palindrome Number");
        }
        sc.close();
    }
}

/* Output:
Enter any number : 121
121 is a Palindrome Number
*/
