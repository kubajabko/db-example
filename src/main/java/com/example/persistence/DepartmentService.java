package com.example.persistence;

import com.example.model.Department;
import com.example.model.Employee;
import org.hibernate.Query;
import org.hibernate.Transaction;

import java.util.Collection;

public class DepartmentService {

    DatabaseConnetor connector;

    public DepartmentService() {
        connector = DatabaseConnetor.getInstance();
    }

    public Collection<Department> getAll() {
        String hql = "FROM Department";
        Query query = connector.getSession().createQuery(hql);
        return query.list();
    }

    public void add(Department department) {
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().save(department);
        transaction.commit();
    }
}
