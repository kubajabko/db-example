package com.example.persistance;

import com.example.model.Department;
import org.hibernate.Query;
import org.hibernate.Transaction;

import java.util.Collection;

public class DepartmentService {

    DatabaseConnetor connector;

    public DepartmentService() {connector = DatabaseConnetor.getInstance();}

    public Collection<Department> getAll() {
        String hql = "FROM Department";
        Query query = connector.getSession().createQuery(hql);
        return query.list();
    }

    public Department add(Department department) {
        Transaction transaction = connector.getSession().beginTransaction();
        transaction.commit();
        return department;
    }
}
