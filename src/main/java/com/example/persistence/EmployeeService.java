package com.example.persistence;

import com.example.model.Employee;
import org.hibernate.Transaction;

//import java.util.Collection;

public class EmployeeService {

    DatabaseConnetor connector;

    public EmployeeService() {connector = DatabaseConnetor.getInstance();}

//    public Collection<Employee> getAll() { return connector.getSession().createCriteria(Employee.class).list();}

//    public Employee findByID(long id) {
//        return (Employee) connetor.getSession().get(Employee.class, id);
//    }

    public void add(Employee employee) {
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().save(employee);
        transaction.commit();
    }
}
