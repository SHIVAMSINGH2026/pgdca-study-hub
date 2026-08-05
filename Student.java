// Practical-39: Write a Java Program to demonstrate Static Method and Instance Method using class and objects.
public class Student {
    String name;
    int roll;

    // Instance Method
    void showDetail() {
        System.out.println("Instance Method -> Name: " + name + ", Roll: " + roll);
    }

    // Static Method
    static void showCollege(String collegeName, String branch, String year) {
        System.out.println("Static Method -> College Name: " + collegeName + " Branch: " + branch + " Year: " + year);
    }

    public static void main(String[] args) {
        // Static Method call
        Student.showCollege("GPL KANPUR", "PGDCA", "II Year");
        System.out.println("=======================================");

        // Instance Method call for Student 1
        Student s1 = new Student();
        s1.name = "Shivam";
        s1.roll = 101;
        s1.showDetail();
        System.out.println("=======================================");

        // Static Method call again
        Student.showCollege("GPL KANPUR", "PGDCA", "II Year");
        System.out.println("=======================================");

        // Instance Method call for Student 2
        Student s2 = new Student();
        s2.name = "Akshay";
        s2.roll = 102;
        s2.showDetail();
        System.out.println("=======================================");
    }
}

/* Output:
Static Method -> College Name: GPL KANPUR Branch: PGDCA Year: II Year
=======================================
Instance Method -> Name: Shivam, Roll: 101
=======================================
Static Method -> College Name: GPL KANPUR Branch: PGDCA Year: II Year
=======================================
Instance Method -> Name: Akshay, Roll: 102
=======================================
*/
