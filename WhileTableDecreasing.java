// Practical-20: Write a Java Program to print tables from 20 to 30 in decreasing order using While Loop.
public class WhileTableDecreasing {
    public static void main(String args[]) {
        int i = 20;
        while (i <= 30) {
            int j = 10;
            while (j >= 1) {
                System.out.println(i * j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}

/* Output:
200 180 160 140 120 100 80 60 40 20
... (tables 20 to 30 in decreasing order)
*/
