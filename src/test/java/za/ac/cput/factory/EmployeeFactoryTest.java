package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void buildEmp() {
      Employee emp1= EmployeeFactory.buildEmp("12312","Masood","Lamer");
      assertNotNull(emp1);
      System.out.println(emp1);
    }

    @Test
    void failBuildEmp() {
        Employee emp2= EmployeeFactory.buildEmp("","Raeesah","Khan");
        assertNotNull(emp2);
        System.out.println(emp2);
    }
}