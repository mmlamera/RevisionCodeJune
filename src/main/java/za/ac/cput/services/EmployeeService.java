package za.ac.cput.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Employee;
import za.ac.cput.repository.EmployeeRepository;

import java.util.List;

@Service

public class EmployeeService implements IEmployeeService{

private EmployeeRepository repository;

     @Autowired
     EmployeeService(EmployeeRepository repository){
     this.repository = repository;
}

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }

//    @Override
//    public Boolean delete(String id) {
//
//    //figure this out
//        //check for delete
//
//    }
}
