package main.interfaces;

import main.repos.EmployeeRepo;

public class EmployeeEventsImpl implements EmployeeEvents{
    private EmployeeRepo employeeRepo;

    public EmployeeEventsImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public boolean Authorize(String id, String password) {
        if (employeeRepo.Authorize(id,password)){
            return true;
        }
        else {
         System.out.println("Zugriff verweigert");
         return false;
        }
    }
}
