package com.example.prac.springbootprac.service;

import com.example.prac.springbootprac.dao.EmployeeDao;
import com.example.prac.springbootprac.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(@Qualifier("employeeDaoJPAImpl")EmployeeDao employeeDao)
    {
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeDao.deleteById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }
}
