package com.example.persistance;

import com.example.model.Employee;
import org.hibernate.Transaction;

import java.util.Collection;

public class EmployeeService {

    DatabaseConnetor connetor;

    public EmployeeService() {connetor = DatabaseConnetor.getInstance();}

    public Collection<Employee> getAll() { return connetor.getSession().createCriteria(Employee.class).list();}

//    public Employee findByID(long id) {
//        return (Employee) connetor.getSession().get(Employee.class, id);
//    }

    public Employee add(Employee employee) {
        Transaction transaction = connetor.getSession().beginTransaction();
        transaction.commit();
        return employee;
    }
}
