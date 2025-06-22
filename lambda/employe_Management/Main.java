package employe_Management;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************* Welcome to Employee Management System ********************");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n================== MENU ==================");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Sort by Name");
            System.out.println("4. Sort by Age");
            System.out.println("5. Sort by Department");
            System.out.println("6. Sort by Salary");
            System.out.println("7. Sort by Employee ID");
            System.out.println("Enter your choice:");

            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Full Name: ");
                    String fullName = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    // ✅ Correct usage
                    Employee emp = new Employee(empId, fullName, age, dept, salary);
                    EmployeService.addEmpployee(emp);
                    System.out.println("✅ Employee added successfully!");
                    break;

                case 2:
                    System.out.println(" All Employees:");
                    EmployeService.getAllEmployees();
                    break;

                case 3:
                    Collections.sort(EmployeService.employes, EmployeService::SortByName);
                    EmployeService.getAllEmployees();
                    break;

                case 4:
                    Collections.sort(EmployeService.employes, EmployeService::SortByAge);
                    EmployeService.getAllEmployees();
                    break;

                case 5:
                    Collections.sort(EmployeService.employes, EmployeService::SortByDepartment);
                    EmployeService.getAllEmployees();
                    break;

                case 6:
                    Collections.sort(EmployeService.employes, EmployeService::SortBySalary);
                    EmployeService.getAllEmployees();
                    break;

                case 7:
                    Collections.sort(EmployeService.employes, EmployeService::SortById);
                    EmployeService.getAllEmployees();
                    break;

                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }
    }
}
