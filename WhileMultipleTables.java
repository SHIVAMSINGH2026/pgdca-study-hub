// Practical-19: Write a Java Program to print multiple tables from 20 to 30 using Nested While Loop.
public class WhileMultipleTables {
    public static void main(String args[]) {
        int i = 20;
        while (i <= 30) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/* Output:
20 40 60 80 100 120 140 160 180 200
... (tables 20 to 30 printed similarly)
*/
