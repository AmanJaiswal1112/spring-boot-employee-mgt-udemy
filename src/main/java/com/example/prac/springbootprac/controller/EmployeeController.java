/*
package com.example.prac.springbootprac.controller;

import com.example.prac.springbootprac.model.Employee;
import com.example.prac.springbootprac.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController
{
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee()
    {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployee(@PathVariable int empId)
    {
        Employee emp = employeeService.findById(empId);
        if(emp == null)
        {
            throw new RuntimeException("Employee id not found :"+empId);
        }
        return emp;
    }

    @DeleteMapping("/employees/{empId}")
    public void deleteEmployee(@PathVariable int empId)
    {
        Employee emp = employeeService.findById(empId);
        if(emp == null)
        {
            throw new RuntimeException("Employee id not found :"+empId);
        }
        employeeService.deleteById(empId);
    }

    @PostMapping("/employees}")
    public void saveEmployee(@RequestBody Employee emp)
    {
        emp.setId(0);
        employeeService.save(emp);
    }

    @PutMapping("/employees}")
    public void updateEmployee(@RequestBody Employee emp)
    {
        employeeService.save(emp);
    }
}
*/
