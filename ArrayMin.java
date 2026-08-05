// Practical-24: Write a Java Program to find Minimum value in Array.
public class ArrayMin {
    public static void main(String args[]) {
        int arr[] = {20, 50, 5, 70, 80, 89};
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Minimum value: " + min);
    }
}

/* Output:
Minimum value: 5
*/
