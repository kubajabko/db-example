package com.example;

import com.example.controllers.DepartmentController;
import com.example.controllers.EmployeeController;
import com.example.model.Department;
import com.example.model.Employee;

import com.example.persistence.HibernateUtil;
import org.hibernate.Session;

public class App {

    //private boolean isOn = true;

    public static void main(String[] args) {
        Employee emp1 = new Employee("Adam", "Kowalski", 1);
        Employee emp2 = new Employee("Jan", "Kowalski", 2);
        Department dep1 = new Department("R&D", 1);
        Department dep2 = new Department("Sales",2);
//        EmployeeController employeeController = new EmployeeController();
//        DepartmentController departmentController = new DepartmentController();
//        employeeController.addEmployeeToDB(emp1);
//        employeeController.addEmployeeToDB(emp2);
//        departmentController.addDepartmentToDB(dep1);
//        departmentController.addDepartmentToDB(dep2);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //Save the employee in database
        session.save(emp1);

        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
