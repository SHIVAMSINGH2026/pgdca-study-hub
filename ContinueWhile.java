// Practical-16: Write a Java Program to demonstrate Continue statement using While Loop.
public class ContinueWhile {
    public static void main(String args[]) {
        int i = 0;
        while (i < 10) {
            i++;
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
