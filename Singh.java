// Main.java (to use Shivam class from package)
import mypackage.Shivam;

public class Singh {
    public static void main(String[] args) {
        // Calling default constructor
        Shivam s1 = new Shivam();

        // Calling parameterized constructor
        Shivam s = new Shivam("Shivam Singh", 101);

        // Method overloading examples
        System.out.println("Multiply :- " + s1.SShivam(12, 12, 6));
        System.out.println("Divide :- " + s1.SShivam(144, 12));
    }
}

/* Output:
Default constructor called
Name: Shivam Singh ID: 101
Multiply :- 150
Divide :- 12

Commands:
cd Desktop
javac mypackage\Shivam.java
javac Singh.java
java Singh
*/
