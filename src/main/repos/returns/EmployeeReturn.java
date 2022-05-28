package main.repos.returns;

import main.classes.Employee;

public class EmployeeReturn extends Return{
    private Employee employee;
    public EmployeeReturn(boolean successful, Employee employee) {
        super(successful);
        this.employee = employee;
    }
    public Employee getEmployee(){
        return employee;
    }
}
