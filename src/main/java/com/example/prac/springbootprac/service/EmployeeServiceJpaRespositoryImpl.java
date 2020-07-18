package com.example.prac.springbootprac.service;

import com.example.prac.springbootprac.dao.EmployeeRepository;
import com.example.prac.springbootprac.model.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class EmployeeServiceJpaRespositoryImpl implements EmployeeService
{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceJpaRespositoryImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id)
    {
        Optional<Employee> result =employeeRepository.findById(id);
        Employee emp = null;

        if(result.isPresent()){
            emp = result.get();
        }

        return emp;
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
