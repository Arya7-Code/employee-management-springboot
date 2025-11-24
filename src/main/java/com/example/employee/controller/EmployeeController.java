package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }


    @GetMapping("/get/{id}")
    public Employee get(@PathVariable int id) {
        return service.getEmployee(id);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    @PutMapping("/update/{id}")
    public Employee update(@RequestBody Employee employee, @PathVariable int id) {
        return service.updateEmployee(employee, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}
