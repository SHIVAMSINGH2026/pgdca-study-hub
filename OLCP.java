// Practical-36: Write a Java Program to demonstrate Constructor Overloading.
public class OLCP {
    String name;
    int age;
    float salary;
    char grade;

    // Default constructor
    OLCP() {
        System.out.println("Default Constructor");
    }

    // Constructor with name
    OLCP(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Constructor with age
    OLCP(int age) {
        this.age = age;
        System.out.println("Age: " + age);
    }

    // Constructor with name and age
    OLCP(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + " Age: " + age);
    }

    // Constructor with salary and grade
    OLCP(float salary, char grade) {
        this.salary = salary;
        this.grade = grade;
        System.out.println("Salary: " + salary + " Grade: " + grade);
    }

    // Constructor with name, age, salary, and grade
    OLCP(String name, int age, float salary, char grade) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary + " Grade: " + grade);
    }

    public static void main(String[] args) {
        // Calling different constructors
        OLCP s1 = new OLCP(); // Default constructor
        OLCP s2 = new OLCP("SHIVAM SINGH"); // Name constructor
        new OLCP(23); // Age constructor
        new OLCP("AKSHAY", 23); // Name and Age constructor
        new OLCP(1000000, 'A'); // Salary and Grade constructor
        new OLCP("SHIV VEER", 24, 200000, 'A'); // Name, Age, Salary, Grade constructor
    }
}

/* Output:
Default Constructor
Name: SHIVAM SINGH
Age: 23
Name: AKSHAY Age: 23
Salary: 1000000.0 Grade: A
Name: SHIV VEER Age: 24 Salary: 200000.0 Grade: A
*/
