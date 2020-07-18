package com.example.prac.springbootprac.dao;

import com.example.prac.springbootprac.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Queue;

@Repository
public class EmployeeDaoHibernateImpl implements EmployeeDao
{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoHibernateImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll()
    {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> emp = theQuery.getResultList();

        return emp;
    }

    public Employee findById(int id)
    {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee theQuery = currentSession.get(Employee.class, id);
        return theQuery;
    }

    public void deleteById(int id)
    {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery(" delete from Employee where id=employeeId");
        theQuery.setParameter("employeeId", id);
        theQuery.executeUpdate();
    }

    public void save(Employee emp)
    {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(emp);
    }

}
