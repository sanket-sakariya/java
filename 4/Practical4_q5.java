import java.util.Scanner;


class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void display() {
        super.display();
        System.out.println("Manager Department: " + department);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void display() {
        super.display();
        System.out.println("Developer Programming Language: " + programmingLanguage);
    }
}
public class Practical4_q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Manager's Name:");
        String managerName = scanner.nextLine();
        System.out.println("Enter Manager's ID:");
        int managerId = scanner.nextInt();
        System.out.println("Enter Manager's Salary:");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Enter Manager's Department:");
        String managerDepartment = scanner.nextLine();

        Manager manager = new Manager(managerName, managerId, managerSalary, managerDepartment);

        System.out.println("Enter Developer's Name:");
        String devName = scanner.nextLine();
        System.out.println("Enter Developer's ID:");
        int devId = scanner.nextInt();
        System.out.println("Enter Developer's Salary:");
        double devSalary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Enter Developer's Programming Language:");
        String devLanguage = scanner.nextLine();

        Developer developer = new Developer(devName, devId, devSalary, devLanguage);

        System.out.println("\nManager Information:");
        manager.display();
        System.out.println("\nDeveloper Information:");
        developer.display();

        scanner.close();
    }
}

