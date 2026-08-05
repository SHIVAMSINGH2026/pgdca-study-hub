// Practical-21: Write a Java Program to print number pattern using While Loop.
public class WhilePattern {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/* Output:
1
12
123
1234
12345
*/
