package com.example.employee.service;

import com.example.employee.entity.Employee;
import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee employee, int id);
    String deleteEmployee(int id);
}
