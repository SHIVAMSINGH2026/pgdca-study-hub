// Practical-37: Write a Java Program to demonstrate Method Overloading with Constructor and Methods using a package.
package mypackage;

public class Shivam {
    // Instance variables
    String name;
    int id;
    int a, b, c;

    // Default Constructor
    public Shivam() {
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor
    public Shivam(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Name: " + name + " ID: " + id);
    }

    // Method overloading 1: multiply and add
    public int SShivam(int a, int b, int c) {
        return a * b + c;
    }

    // Method overloading 2: divide
    public int SShivam(int c, int d) {
        return c / d;
    }
}
