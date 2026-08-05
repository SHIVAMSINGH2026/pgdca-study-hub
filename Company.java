// Practical-51: Write a Java program to demonstrate Hybrid Inheritance using classes and interfaces.
interface Employee {
    void work();
}

interface Manager extends Employee {
    void manage();
}

class Developer implements Employee {
    public void work() {
        System.out.println("Developer is writing code.");
    }
}

class TeamLead extends Developer implements Manager {
    public void manage() {
        System.out.println("TeamLead is managing the development team.");
    }
}

public class Company {
    public static void main(String[] args) {
        TeamLead t = new TeamLead();
        t.work();
        t.manage();
    }
}

/* Output:
Developer is writing code.
TeamLead is managing the development team.
*/
