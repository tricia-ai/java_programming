package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem4;

public class EmployeeManagement {
    public static String companyName;
    private String employeeName;
    private double salary;
    public EmployeeManagement(String name) {
        employeeName = name;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative");
        }
        salary = salary;
    }
    public void calculateBonus() {
        return salary * 0.1;
    }
}
