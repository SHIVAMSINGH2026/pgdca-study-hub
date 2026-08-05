// Practical-17: Write a Java Program to demonstrate Break statement using While Loop.
public class BreakWhile {
    public static void main(String args[]) {
        int i = 0;
        while (i <= 10) {
            i++;
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}

/* Output:
1
2
3
*/
