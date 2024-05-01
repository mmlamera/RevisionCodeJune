package za.ac.cput.services;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeServiceTest {
   @Autowired
   private EmployeeService employeeService;
    private static Employee employee1;
    private static Employee employee2;
    @Test
    @Order(1)
    void setUp() {
        employee1 = EmployeeFactory.buildEmp("232323","john","Doe");
        assertNotNull(employee1);
        System.out.println(employee1);

        employee2 = EmployeeFactory.buildEmp("562323","Mick","Tyson");
        assertNotNull(employee2);
        System.out.println(employee2);

    }
    @Test
    @Order(2)
    void create() {
        Employee create1 = employeeService.create(employee1);
        assertNotNull(create1);
        System.out.println(create1);

        Employee create2 = employeeService.create(employee2);
        assertNotNull(create2);
        System.out.println(create2);

    }
    @Test
    @Order(5)
    void getAll() {
        System.out.println(employeeService.getAll());
    }




    @Test
    @Order(4)
    void read() {

        Employee read = employeeService.read(employee1.getEmpNo());
        assertNotNull(read);
        System.out.println(read);

    }

    @Test
    @Order(3)
    void update() {
    Employee newEmp = new Employee.Builder().copy(employee2).setfName("Michael").build();
    Employee update = employeeService.update(newEmp);
        System.out.println(update);
    }




}