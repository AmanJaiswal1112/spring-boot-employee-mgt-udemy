package com.example.prac.springbootprac.dao;

import com.example.prac.springbootprac.model.Employee;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDaoJPAImpl implements EmployeeDao {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        Query theQuery = entityManager.createQuery("from Employee");
        List<Employee> emp = theQuery.getResultList();
        return emp;
    }

    public Employee findById(int id) {

        Employee theEmp = entityManager.find(Employee.class, id);
        return theEmp;
    }

    public void deleteById(int id)
    {
        Query theQuery = entityManager.createQuery(" delete from Employee where id=employeeId");
        theQuery.setParameter("employeeId", id);
        theQuery.executeUpdate();
    }

    public void save(Employee emp) {
        Employee dbEmp = entityManager.merge(emp);
        emp.setId(dbEmp.getId());

    }
}