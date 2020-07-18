package com.example.prac.springbootprac.service;

import com.example.prac.springbootprac.model.Employee;

import java.util.List;

public interface EmployeeService
{
    public List<Employee> findAll();

    public Employee findById(int id);

    public void deleteById(int id);

    public void save(Employee employee);
}
