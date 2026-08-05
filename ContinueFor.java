// Practical-8: Write a Java Program to demonstrate Continue statement using For Loop.
public class ContinueFor {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/* Output:
1
2
3
5
6
7
8
9
10
*/
