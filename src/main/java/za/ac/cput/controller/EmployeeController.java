package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Employee;
import za.ac.cput.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @GetMapping("/read/{empNo}")
    public Employee read(@PathVariable String empNo) {
        return employeeService.read(empNo);
    }

    @PostMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    //check for delete
}
