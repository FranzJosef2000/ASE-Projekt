package main.repos;

import main.classes.Address;
import main.classes.Employee;
import main.classes.Packet;
import main.package_Category;
import main.package_state;

import java.util.ArrayList;

public class EmployeeRepository implements EmployeeRepo{
    ArrayList<Employee> employeeRepository = new ArrayList();

    public EmployeeRepository() {
        employeeMockup();
    }
    private void employeeMockup(){
        employeeRepository.add(new Employee("vrv81r38-6s6s-5819-9sfs-v68g1fv2620r","test123"));
        }
    public ArrayList returnPacket(){
        return employeeRepository;
    }

    @Override
    public boolean Authorize(String id, String password) {
        Employee employee = employeeRepository.stream().filter(item->id.equals(item.getId())).findFirst().orElse(null);
        if (employee != null)
        {
            return employee.checkpassword(password);
        }
        return false;
    }
}
