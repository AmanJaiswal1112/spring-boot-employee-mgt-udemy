package com.example.prac.springbootprac.dao;

import com.example.prac.springbootprac.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDao
{
    public List<Employee> findAll();

    public Employee findById(int id);

    public void deleteById(int id);

    public void save(Employee employee);
}
