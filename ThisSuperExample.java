// Practical-45: Write a Java Program to demonstrate use of this and super keywords together with constructor chaining.
class Bank {
    String bankName;
    double rateOfInterest;

    // Parent class constructor
    Bank(String bankName, double rateOfInterest) {
        this.bankName = bankName; // 'this' for current class
        this.rateOfInterest = rateOfInterest;
        System.out.println("Bank constructor called using this keyword.");
    }

    void showDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

class SBI extends Bank {
    String branchName;
    String managerName;

    // Child class constructor
    SBI(String bankName, double rateOfInterest, String branchName, String managerName) {
        super(bankName, rateOfInterest); // 'super' to call parent constructor
        this.branchName = branchName; // 'this' for current class variables
        this.managerName = managerName;
        System.out.println("SBI constructor called using super keyword.");
    }

    void showDetails() {
        super.showDetails(); // 'super' to call parent method
        System.out.println("Branch Name: " + branchName);
        System.out.println("Manager Name: " + managerName);
    }
}

public class ThisSuperExample {
    public static void main(String[] args) {
        SBI s1 = new SBI("State Bank of India", 6.5, "Kanpur Branch", "Shivam Singh");
        System.out.println("\nAccount Information:");
        s1.showDetails();
    }
}

/* Output:
Bank constructor called using this keyword.
SBI constructor called using super keyword.

Account Information:
Bank Name: State Bank of India
Rate of Interest: 6.5%
Branch Name: Kanpur Branch
Manager Name: Shivam Singh
*/
