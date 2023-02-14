package homeworks.employee;

public class EmployeeStorage {
    private static Employee[] employees = new Employee[10];
    private int size;


    public void add(Employee employee) {

        if (size == employees.length) {

            extend();
        }
        employees[size++] = employee;

    }


    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");

        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];

            }
        }

        return null;
    }


    public void searchEmployeeByCompanyName(String companyName) {
        for (int i = 0; i < size; i++) {

            if (employees[i].getCompany().equals(companyName)) {
                System.out.println(employees[i]);

            }


        }

    }


    public Employee[] getEmployees() {

        return employees;
    }


    public boolean activateEmployeeById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i].setActive(true);
                return true;
            }
        }
        return false;
    }

    public void printActiveEmployees() {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive()) {
                System.out.println(employees[i]);
            }
        }
    }
}





