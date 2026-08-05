// Practical-26: Write a Java Program to print Array elements in Reverse Order.
public class ArrayReverse {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

/* Output:
50
40
30
20
10
*/
