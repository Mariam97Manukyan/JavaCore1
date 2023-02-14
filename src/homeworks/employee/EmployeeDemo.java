package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employees");
            System.out.println("Please input 3 for search  employee by employee ID");
            System.out.println("Please input 4 for search  employee by company name");
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 to change employee position by ID");
            System.out.println("Please input 8 to set employee inactive by ID");
            System.out.println("Please input 9 to set employee active by ID");
            System.out.println("Please input 7 for print only active employees");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "8":
                    inactiveEmployeeById();
                    break;
                case "9":
                    activateEmployeeById();
                    break;
                case "7":
                    employeeStorage.printActiveEmployees();
                    break;
                default:
                    System.out.println("Wrong command. Please, try again.");

            }
        }
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with " + employeeId + " is does not exists");
        } else {
            System.out.println(employeeId);
        }
    }

    private static void addEmployee() {
        System.out.println("Please input name,surname, employeeId,salary,companyName,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeById + " id already exists");


        }
    }

    private static void searchEmployeeBySalaryRange() {

        System.out.println("Please input minimum salary:");
        double minSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please input maximum salary:");
        double maxSalary = scanner.nextDouble();
        scanner.nextLine();
        boolean foundEmployees = false;
        for (Employee employee : employeeStorage.getEmployees()) {
            if (employee != null && employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                System.out.println(employee);
                foundEmployees = true;
            }
        }
        if (!foundEmployees) {
            System.out.println("No employees found in the given salary range.");
        }
    }


    private static void changeEmployeePositionById() {
        System.out.println("Please input employee ID");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with ID " + employeeId + " does not exist");
        } else {
            System.out.println("Please input new position");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position for employee with ID " + employeeId + " has been changed to " + position);
        }
    }

    private static void inactiveEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with id " + employeeId + " does not exist");
        } else {
            employee.setActive(false);
            System.out.println("Employee with id " + employeeId + " has been marked as inactive");
        }
    }

    private static void activateEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        boolean isActivated = employeeStorage.activateEmployeeById(employeeId);
        if (isActivated) {
            System.out.println("Employee with " + employeeId + " is activated");
        } else {
            System.out.println("Employee with " + employeeId + " does not exist");
        }
    }
}