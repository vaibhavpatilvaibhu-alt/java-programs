package day1;
import java.util.Scanner;
class EmployeeData {
    String name;
    int age;
    String designation;
    double salary;
}

public class employee {

    static Scanner sc = new Scanner(System.in);
    static EmployeeData[] employees = new EmployeeData[100];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    raiseSalary();
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using Employee Management System!"
                    );
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    static void createEmployee() {

        while (true) {

            System.out.println("\n----- Create Employee -----");

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("\nSelect your designation:");
            System.out.println("1. Programmer");
            System.out.println("2. Manager");
            System.out.println("3. Tester");
            System.out.print("Enter choice: ");

            int d = sc.nextInt();
            sc.nextLine();

            String designation;

            if (d == 1) {
                designation = "Programmer";
            } else if (d == 2) {
                designation = "Manager";
            } else if (d == 3) {
                designation = "Tester";
            } else {
                System.out.println("Invalid designation!");
                continue;
            }

            System.out.println("\n----- Employee Details -----");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);

            System.out.print("\nDo you want to edit? (yes/no): ");
            String edit = sc.nextLine();

            if (edit.equalsIgnoreCase("no")) {

                if (count >= employees.length) {
                    System.out.println("Employee storage is full!");
                    return;
                }

                EmployeeData e = new EmployeeData();

                e.name = name;
                e.age = age;
                e.designation = designation;
                e.salary = 30000;

                employees[count] = e;
                count++;

                System.out.println("Employee saved successfully!");
                break;
            }
        }
    }

    static void displayEmployees() {

        if (count == 0) {
            System.out.println("\nNo employee records available.");
            return;
        }

        System.out.println("\n===== Employee Details =====");
        System.out.println("Name\tAge\tDesignation\tSalary");

        for (int i = 0; i < count; i++) {

            System.out.println(
                employees[i].name + "\t" +
                employees[i].age + "\t" +
                employees[i].designation + "\t" +
                employees[i].salary
            );
        }
    }

    static void raiseSalary() {

        if (count == 0) {
            System.out.println("\nNo employee records available.");
            return;
        }

        System.out.println("\nAvailable Employees:");

        for (int i = 0; i < count; i++) {
            System.out.println(
                (i + 1) + ". " + employees[i].name
            );
        }

        System.out.print("Select employee: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > count) {
            System.out.println("Invalid employee!");
            return;
        }

        EmployeeData e = employees[choice - 1];

        System.out.print("Enter salary raise amount: ");
        double raise = sc.nextDouble();

        if (raise < 0) {
            System.out.println("Raise amount cannot be negative!");
            return;
        }

        e.salary = e.salary + raise;

        System.out.println("Salary updated successfully!");
        System.out.println("New salary: " + e.salary);
    }
}
