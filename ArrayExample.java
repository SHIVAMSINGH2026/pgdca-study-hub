// Practical-22: Write a Java Program to print elements of an Array.
public class ArrayExample {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.println("First element: " + arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/* Output:
First element: 10
10
20
30
40
50
60
*/
