package com.example.persistence;

import com.example.model.Employee;
import org.hibernate.Query;
import org.hibernate.Transaction;

import java.util.Collection;

public class EmployeeService {

    DatabaseConnetor connector;

    public EmployeeService() {
        connector = DatabaseConnetor.getInstance();
    }

    public Collection<Employee> getAll() {
        String hql = "FROM Employee";
        Query query = connector.getSession().createQuery(hql);
        return query.list();
    }

    public void add(Employee employee) {
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().save(employee);
        transaction.commit();
    }

    public void update(Employee employee) {
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().merge(employee);
        transaction.commit();
    }

    public void delete(Employee employee) {
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().delete(employee);
        transaction.commit();
    }

}