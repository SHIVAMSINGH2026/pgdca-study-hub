// Practical-53: Write a Java Program to demonstrate Abstract Class, Method Overloading, and Method Overriding.
abstract class Company {
    String companyName = "TechVision Pvt. Ltd.";

    // Abstract method (to be implemented by subclasses)
    abstract void showDetails();

    // Overloaded Methods (same name, different parameters)
    void calculateSalary(double baseSalary) {
        System.out.println("Base Salary: Rs." + baseSalary);
    }

    void calculateSalary(double baseSalary, double bonus) {
        System.out.println("Total Salary with Bonus: Rs." + (baseSalary + bonus));
    }

    void showCompanyName() {
        System.out.println("Company: " + companyName);
    }
}

// Subclass 1
class Developer extends Company {
    String empName;
    String position = "Developer";

    Developer(String empName) {
        this.empName = empName;
    }

    // Overriding Abstract Method
    void showDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Position: " + position);
    }
}

// Subclass 2
class Manager extends Company {
    String empName;
    String position = "Manager";

    Manager(String empName) {
        this.empName = empName;
    }

    // Overriding Abstract Method
    void showDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Position: " + position);
    }
}

// Main Class
public class CompanyDemo {
    public static void main(String[] args) {
        Developer d1 = new Developer("Shivam Singh");
        Manager m1 = new Manager("Shiv veer");

        d1.showCompanyName();
        d1.showDetails();
        d1.calculateSalary(40000);
        d1.calculateSalary(40000, 5000);

        System.out.println("\n-----------------------------");

        m1.showCompanyName();
        m1.showDetails();
        m1.calculateSalary(60000);
        m1.calculateSalary(60000, 10000);
    }
}

/* Output:
Company: TechVision Pvt. Ltd.
Employee Name: Shivam Singh
Position: Developer
Base Salary: Rs.40000.0
Total Salary with Bonus: Rs.45000.0

-----------------------------
Company: TechVision Pvt. Ltd.
Employee Name: Shiv veer
Position: Manager
Base Salary: Rs.60000.0
Total Salary with Bonus: Rs.70000.0
*/
