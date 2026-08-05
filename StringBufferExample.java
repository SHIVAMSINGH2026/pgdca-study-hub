// Practical-42: Write a Java Program to perform all basic operations using StringBuffer.
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shivam");
        System.out.println("Original StringBuffer: " + sb);

        sb.append(" Singh");
        System.out.println("After Append: " + sb);

        sb.insert(0, "Mr. ");
        System.out.println("After Insert: " + sb);

        sb.replace(0, 3, "Er.");
        System.out.println("After Replace: " + sb);

        sb.delete(0, 4);
        System.out.println("After Delete: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
    }
}

/* Output:
Original StringBuffer: Shivam
After Append: Shivam Singh
After Insert: Mr. Shivam Singh
After Replace: Er. Shivam Singh
After Delete: Shivam Singh
After Reverse: hgniS mavihS
Capacity: 34
Length: 12
*/
