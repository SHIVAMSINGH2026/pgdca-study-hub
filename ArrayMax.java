// Practical-25: Write a Java Program to find Maximum value in Array.
public class ArrayMax {
    public static void main(String args[]) {
        int arr[] = {20, 50, 5, 70, 80, 89};
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Maximum value: " + max);
    }
}

/* Output:
Maximum value: 89
*/
