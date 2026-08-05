// Practical-41: Write a Java Program to perform all basic String operations.
public class StringOperation {
    public static void main(String[] args) {
        String s1 = "Shivam";
        String s2 = "Singh";
        String s3 = " Java Programming ";

        System.out.println("Length of s1: " + s1.length());
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Concatenation: " + s1.concat(" ").concat(s2));
        System.out.println("Character at index 2: " + s1.charAt(2));
        System.out.println("Substring (2 to 5): " + s1.substring(2, 5));
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase("shivam"));
        System.out.println("CompareTo: " + s1.compareTo(s2));
        System.out.println("Starts With 'Shi': " + s1.startsWith("Shi"));
        System.out.println("Ends With 'am': " + s1.endsWith("am"));
        System.out.println("Index of 'v': " + s1.indexOf('v'));
        System.out.println("Trim: '" + s3.trim() + "'");
        System.out.println("Replace 'a' with 'A': " + s3.replace('a', 'A'));
    }
}

/* Output:
Length of s1: 6
Uppercase: SHIVAM
Lowercase: shivam
Concatenation: Shivam Singh
Character at index 2: i
Substring (2 to 5): iva
Equals: false
Equals Ignore Case: true
CompareTo: -10
Starts With 'Shi': true
Ends With 'am': true
Index of 'v': 3
Trim: 'Java Programming'
Replace 'a' with 'A': JAva ProgrAmming
*/
