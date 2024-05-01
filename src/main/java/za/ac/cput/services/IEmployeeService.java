package za.ac.cput.services;

import za.ac.cput.Domain.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public interface IEmployeeService extends IService<Employee, String> {
    List<Employee> getAll();

}
