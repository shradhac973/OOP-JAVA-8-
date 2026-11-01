package lab_sheet_8.Q03;

public class EmployeeBeanMain {
    public static void main(String[] args) {
        EmployeeBean employee = new EmployeeBean(2001, "Maya Singh", 52000);
        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Employee name: " + employee.getEmpName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Serializable: " + (employee instanceof java.io.Serializable));
    }
}
