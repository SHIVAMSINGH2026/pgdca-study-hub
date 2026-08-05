// Practical-23: Write a Java Program to find Sum and Average of Array elements.
public class ArraySumAverage {
    public static void main(String args[]) {
        int array[] = {10, 20, 30, 40, 50, 60};
        float sum = 0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            sum = sum + array[i];
        }
        float average = sum / len;
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);
    }
}

/* Output:
Sum of array: 210.0
Average of array: 35.0
*/
