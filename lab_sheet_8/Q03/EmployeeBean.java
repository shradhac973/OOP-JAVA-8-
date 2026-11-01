package lab_sheet_8.Q03;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private int empId;
    private String empName;
    private double salary;

    public EmployeeBean() {
    }

    public EmployeeBean(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
