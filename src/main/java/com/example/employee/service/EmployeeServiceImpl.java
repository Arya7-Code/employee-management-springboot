package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, int id) {
        Employee e = repo.findById(id).orElse(null);
        if (e == null) return null;
        e.setName(employee.getName());
        e.setEmail(employee.getEmail());
        e.setSalary(employee.getSalary());
        return repo.save(e);
    }

    @Override
    public String deleteEmployee(int id) {
        repo.deleteById(id);
        return "Employee deleted";
    }
}
