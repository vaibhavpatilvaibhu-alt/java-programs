package prg12;
import java.util.*;

class Employee {
    String name, designation;
    int age;
    double salary;

    Employee(String n, int a, String d) {
        name = n;
        age = a;
        designation = d;
        salary = 30000;
    }
}


public class EmployeeManagement {
	static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) create();
            else if (choice == 2) display();
            else if (choice == 3) raiseSalary();
            else if (choice == 4) {
                System.out.println("Thank you for using Employee Management System!");
                break;
            }
        }
    }

    static void create() {
        while (true) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Select designation:");
            System.out.println("1. Programmer");
            System.out.println("2. Manager");
            System.out.println("3. Tester");
            int d = sc.nextInt();
            sc.nextLine();

            String designation =
                    d == 1 ? "Programmer" :
                    d == 2 ? "Manager" : "Tester";

            System.out.println("\nName: " + name);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);

            System.out.print("Do you want to edit? (YES/NO): ");
            String edit = sc.nextLine();

            if (edit.equalsIgnoreCase("NO")) {
                list.add(new Employee(name, age, designation));
                System.out.println("Employee saved!");
                break;
            }
            // YES automatically repeats the Create process
        }
    }

    static void display() {
        if (list.isEmpty()) {
            System.out.println("No employee records available.");
            return;
        }

        for (Employee e : list)
            System.out.println(e.name + " | " + e.age + " | "
                    + e.designation + " | ₹" + e.salary);
    }

    static void raiseSalary() {
        if (list.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        display();
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        for (Employee e : list) {
            if (e.name.equalsIgnoreCase(name)) {
                System.out.print("Enter raise amount: ₹");
                e.salary += sc.nextDouble();
                sc.nextLine();
                System.out.println("Salary updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}


