package test;

import main.classes.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeClassTest {
    Employee employee;

    @BeforeEach
    public void prepareTest(){
        employee = new Employee("asdfg","12345678");
    }
    @Test
    public void checkPasswordTest(){
        assertTrue(employee.checkpassword("12345678"));
    }
    @Test
    public void checkPasswordTestNegative(){
        assertFalse(employee.checkpassword("aaaaaaaa"));
    }
}
