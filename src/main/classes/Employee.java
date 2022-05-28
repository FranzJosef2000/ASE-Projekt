package main.classes;

public class Employee {
    String ID;
    String password;

    public Employee(String id, String password){
        this.ID = id;
        this.password = password;
    }
    public String getId(){
        return ID;
    }
    public boolean checkpassword(String password){
        if (password.equals(this.password)){
            return true;
        }
        else {
            return false;
        }

    }
}
